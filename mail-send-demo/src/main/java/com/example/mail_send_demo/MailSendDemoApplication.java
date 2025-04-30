package com.example.mail_send_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MailSendDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailSendDemoApplication.class, args);
	}

}
