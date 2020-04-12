package com.lawencon.pendaftaranmahasiswa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.lawencon.pendaftaranmahasiswa.model.Mahasiswa;
import com.lawencon.pendaftaranmahasiswa.model.Status;

@Component
public class EmailServiceImpl implements EmailService{

	@Autowired
    public JavaMailSender emailSender;
	
	@Override
	public void sendEmails(Mahasiswa mhs) throws Exception {
		SimpleMailMessage message = new SimpleMailMessage(); 
		if(mhs.getStatus().equals(Status.BELUM.name())) {
			message.setTo(mhs.getEmailMhs()); 
	        message.setSubject("noRply"); 
	        message.setText("Thank you for your registration please wait a moment for a next step !");
	        emailSender.send(message);
		}else if(mhs.getStatus().equals(Status.ACCEPT.name())) {
			message.setTo(mhs.getEmailMhs()); 
	        message.setSubject("noRply"); 
	        message.setText("Congratulations, you have been accept on this campus !");
	        emailSender.send(message);
		}else {
			message.setTo(mhs.getEmailMhs()); 
	        message.setSubject("noRply"); 
	        message.setText("Thank you for registering on this campus, with a heavy heart we cannot accept you, keep your spirits and see you next time !");
	        emailSender.send(message);
		}
        
	}
}
