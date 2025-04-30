package com.example.mail_send_demo.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

import java.time.LocalDateTime;

@Service
public class EmailService implements IMailSenderService{
    private final JavaMailSender mailSender;

    private final SpringTemplateEngine templateEngine;

    @Value("${spring.mail.username}")
    private String from;

    public EmailService(JavaMailSender mailSender, SpringTemplateEngine templateEngine) {
        this.mailSender = mailSender;
        this.templateEngine = templateEngine;
    }

    @Override
    public void sendSimpleEmail(String to, String subject, String message) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(message);
        mailMessage.setFrom(from);

        mailSender.send(mailMessage);
    }

    @Override
    public void sendHtmlEmail(String name, String toEmail, String subject, String message) {
        Context context = new Context();

        String time = LocalDateTime.now().toString();

        context.setVariable("name", name);
        context.setVariable("message", message);
        context.setVariable("time", time);

        String processedMail = templateEngine.process("emailTemplate.html", context);

        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);

            helper.setTo(toEmail);
            helper.setSubject(subject);
            helper.setFrom(from);
            helper.setText(processedMail, true);

            mailSender.send(mimeMessage);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    //  Testing every min: (cron = "0 * * * * ?")
    @Scheduled(cron = "0 0 9 * * ?") // Every day at 9 AM :
    public void sendDailyEmail() {
        String message = "Daily report at " + LocalDateTime.now();
        sendSimpleEmail("t210256@famt.ac.in", "Daily Report", message);
    }
}
