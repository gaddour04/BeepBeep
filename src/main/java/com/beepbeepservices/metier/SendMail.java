package com.beepbeepservices.metier;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;



public class SendMail implements SendMailInterface{
	@Autowired
	JavaMailSender javaMailSender;

	@Override
	public void sendSimpleMail(String to, String subject, String msg) {
		
		  SimpleMailMessage messgae=new SimpleMailMessage();
		  messgae.setFrom("siteweb04django@gmail.com");
		  messgae.setTo(to);
		  messgae.setSubject(subject);
		  messgae.setText(msg);
		  javaMailSender.send(messgae);
		 
		
	}
	public static String uploadDir=System.getProperty("user.dir")+"/src/main/resources/templates/mail.html";
	@Override
	public void sendAttachmentMail(String to, String subject) {
		MimeMessage message=javaMailSender.createMimeMessage();
		try {
			MimeMessageHelper helper=new MimeMessageHelper(message,true);
			String html="<body style='border:2px solid black'>"
                    +"Your onetime password for registration is  " 
                    + "Please use this OTP to complete your new user registration."+
                      "OTP is confidential, do not share this  with anyone.</body>";
			message.setContent(html,"text/html");
			helper.setFrom("siteweb04django@gmail.com");
			helper.setTo(to);
			helper.setSubject(subject);
			//helper.setText("Test");
			File file=new java.io.File(uploadDir);
			helper.addAttachment(file.getName(), file);
			javaMailSender.send(message);
		} catch (MessagingException e) {
			
			e.printStackTrace();
		}
		
	}

}
