package com.beepbeepservices.metier;

public interface SendMailInterface {
	
	public void sendSimpleMail(String to,String subject,String msg);
	public void sendAttachmentMail(String to,String subject);

}
