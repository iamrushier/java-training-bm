package com.example.mail_send_demo.service;

public interface IMailSenderService {
    void sendSimpleEmail(String to, String subject, String message);

    void sendHtmlEmail(String name, String toEmail, String subject, String message);
}
