package com.beepbeepservices;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.beepbeepservices.dao.ColiRepository;
import com.beepbeepservices.dao.UserRepository;
import com.beepbeepservices.dao.VilleRepository;
import com.beepbeepservices.entites.Admin;
import com.beepbeepservices.entites.Coli;
import com.beepbeepservices.entites.User;
import com.beepbeepservices.entites.Ville;
import com.beepbeepservices.metier.EmailService;


@SpringBootApplication

public class BeepBeepServicesApplication implements CommandLineRunner {
	@Autowired
	ColiRepository coliRepository;
	@Autowired
	VilleRepository villeRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	PasswordEncoder passwordencoder;
	@Autowired
	JavaMailSender javaMailSender;
	@Autowired
	private EmailService service;
	public static void main(String[] args) {
		SpringApplication.run(BeepBeepServicesApplication.class, args);
	}

	String nom="abdelkader";
	String image="C:/Users/gaddo/Desktop/BigData/gaddour.jpg";
	public void run(String... args) throws Exception {
		

		//service.sendEmail();
		/*
		 * Map<String, Object> model = new HashMap<>(); model.put("Name",
		 * "Beep Beep Services"); model.put("location", "Nabeul,Tunisie");
		 * service.sendEmail( model);
		 */

		
		/*  
		 * MimeMessage message=javaMailSender.createMimeMessage(); try {
		 * MimeMessageHelper helper=new MimeMessageHelper(message,true); String
		 * html="<h1 style=\"color: red\">Send Html Mail From Spring boot App Test </h1>\n"
		 * + "<a style=\"color: blue\" href=\"https://www.youtube.com/\">Youtube</a>" +
		 * "<img src="+image+">"; message.setContent(html,"text/html");
		 * helper.setFrom("siteweb04django@gmail.com");
		 * helper.setTo("gaddour04@gmail.com"); helper.setSubject("ya 3ali 3");
		 * //helper.setText("Test"); ClassPathResource resource=new
		 * ClassPathResource("403.png"); 
		 * //helper.addInline("logoImage",resource); FileSystemResource res = new
		 * FileSystemResource(new File("C:/Users/gaddo/Desktop/BigData/gaddour.jpg"));
		 * //helper.addInline("identifier1234", res); javaMailSender.send(message);
		 * 
		 * 
		 * // let's include the infamous windows Sample file (this time copied to c:/)
		 * 
		 * } catch (MessagingException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		/*
		 * String x="CA"; Random rand = new Random(); int rand_int= rand.nextInt(1000);
		 * String reference=x+rand_int; User user6=userRepository.findById(6L).get();
		 * Ville ville1=villeRepository.findById(1).get(); User
		 * user12=userRepository.findById(12L).get(); Ville
		 * ville2=villeRepository.findById(2).get(); User
		 * user13=userRepository.findById(13L).get(); Ville
		 * ville3=villeRepository.findById(3).get(); User
		 * user14=userRepository.findById(14L).get(); Ville
		 * ville4=villeRepository.findById(4).get(); User
		 * user2=userRepository.findById(2L).get();
		 * 
		 * String sDate1="2021-05-02"; Date date=new
		 * SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
		 * 
		 * String sDate2="2021-05-27"; Date date2=new
		 * SimpleDateFormat("yyyy-MM-dd").parse(sDate2); String sDate3="2021-05-23";
		 * Date date3=new SimpleDateFormat("yyyy-MM-dd").parse(sDate3);
		 * 
		 * coliRepository.save(new
		 * Coli(null,reference,user6,"med maouia",25145658,ville1,"hammamet",85,1,
		 * "Livré", date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user12,"abdalllah",25145658,ville2,"marsa",133,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"chkips",25145658,ville1,"manzel tmim",52,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user6,"mouhidine",25145658,ville3,"messeadine",155,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"mourouj 2",97,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"ariana",105,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"ali",25145658,ville1,"maamoura",105,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"kram",80,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"mourouj 2",78,1,"Livré",
		 * date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"mouhidine",25145658,ville3,"manzel khir",157,1,
		 * "Livré",date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"chkips",25145658,ville1,"bni khiar",107,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"mouhidine",25145658,ville3,"ouardanine",75,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"ariana",105,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"mannouba",60,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"samir",25145658,ville3,"manzel harb",88,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user6,"med maouia",25145658,ville1,"grombalia",85,1,
		 * "Livré", date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user12,"abdalllah",25145658,ville2,"marsa",133,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"chkips",25145658,ville1,"manzel tmim",52,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user6,"mouhidine",25145658,ville3,"messeadine",155,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"mourouj 2",97,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"ariana",105,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"ali",25145658,ville1,"somaa",105,1,"Livré",date3,
		 * null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"kram",80,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"mourouj 2",78,1,"Livré",
		 * date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"mouhidine",25145658,ville3,"manzel khir",157,1,
		 * "Livré",date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"chkips",25145658,ville1,"bni khiar",107,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"mouhidine",25145658,ville3,"ouardanine",75,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"ariana",105,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"mannouba",60,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"samir",25145658,ville3,"manzel harb",88,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user6,"med maouia",25145658,ville1,"hammamet",85,1,
		 * "Livré", date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user12,"abdalllah",25145658,ville2,"marsa",133,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"chkips",25145658,ville1,"manzel tmim",52,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user6,"mouhidine",25145658,ville3,"messeadine",155,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"mourouj 2",97,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"ariana",105,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"ali",25145658,ville1,"maamoura",105,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"kram",80,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"mourouj 2",78,1,"Livré",
		 * date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"mouhidine",25145658,ville3,"manzel khir",157,1,
		 * "Livré",date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"chkips",25145658,ville1,"bni khiar",107,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"mouhidine",25145658,ville3,"ouardanine",75,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"ariana",105,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"mannouba",60,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"samir",25145658,ville3,"manzel harb",88,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user6,"med maouia",25145658,ville1,"grombalia",85,1,
		 * "Livré", date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user12,"abdalllah",25145658,ville2,"marsa",133,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"chkips",25145658,ville1,"manzel tmim",52,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user6,"mouhidine",25145658,ville3,"messeadine",155,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"mourouj 2",97,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"ariana",105,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"ali",25145658,ville1,"somaa",105,1,"Livré",date3,
		 * null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"kram",80,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"mourouj 2",78,1,"Livré",
		 * date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"mouhidine",25145658,ville3,"manzel khir",157,1,
		 * "Livré",date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"chkips",25145658,ville1,"bni khiar",107,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"mouhidine",25145658,ville3,"ouardanine",75,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"ariana",105,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"mannouba",60,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"samir",25145658,ville3,"manzel harb",88,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user6,"med maouia",25145658,ville1,"hammamet",85,1,
		 * "Livré", date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user12,"abdalllah",25145658,ville2,"marsa",133,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"chkips",25145658,ville1,"manzel tmim",52,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user6,"mouhidine",25145658,ville3,"messeadine",155,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"mourouj 2",97,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"ariana",105,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"ali",25145658,ville1,"maamoura",105,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"kram",80,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"mourouj 2",78,1,"Livré",
		 * date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"mouhidine",25145658,ville3,"manzel khir",157,1,
		 * "Livré",date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"chkips",25145658,ville1,"bni khiar",107,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"mouhidine",25145658,ville3,"ouardanine",75,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"ariana",105,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"mannouba",60,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"samir",25145658,ville3,"manzel harb",88,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user6,"med maouia",25145658,ville1,"grombalia",85,1,
		 * "Livré", date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user12,"abdalllah",25145658,ville2,"marsa",133,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"chkips",25145658,ville1,"manzel tmim",52,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user6,"mouhidine",25145658,ville3,"messeadine",155,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"mourouj 2",97,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"ariana",105,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"ali",25145658,ville1,"somaa",105,1,"Livré",date3,
		 * null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"kram",80,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"mourouj 2",78,1,"Livré",
		 * date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"mouhidine",25145658,ville3,"manzel khir",157,1,
		 * "Livré",date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"chkips",25145658,ville1,"bni khiar",107,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"mouhidine",25145658,ville3,"ouardanine",75,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"ariana",105,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"mannouba",60,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"samir",25145658,ville3,"manzel harb",88,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user6,"med maouia",25145658,ville1,"hammamet",85,1,
		 * "Livré", date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user12,"abdalllah",25145658,ville2,"marsa",133,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"chkips",25145658,ville1,"manzel tmim",52,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user6,"mouhidine",25145658,ville3,"messeadine",155,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"mourouj 2",97,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"ariana",105,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"ali",25145658,ville1,"maamoura",105,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"kram",80,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"mourouj 2",78,1,"Livré",
		 * date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"mouhidine",25145658,ville3,"manzel khir",157,1,
		 * "Livré",date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"chkips",25145658,ville1,"bni khiar",107,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"mouhidine",25145658,ville3,"ouardanine",75,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"ariana",105,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"mannouba",60,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"samir",25145658,ville3,"manzel harb",88,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user6,"med maouia",25145658,ville1,"grombalia",85,1,
		 * "Livré", date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user12,"abdalllah",25145658,ville2,"marsa",133,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"chkips",25145658,ville1,"manzel tmim",52,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user6,"mouhidine",25145658,ville3,"messeadine",155,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"mourouj 2",97,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"ariana",105,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"alia",25145658,ville1,"somaa",105,1,"Livré",date3,
		 * null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"kram",80,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sbandes",25145658,ville2,"mourouj 2",78,1,"Livré"
		 * ,date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"mouhidine",25145658,ville3,"manzel khir",157,1,
		 * "Livré",date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"chkips",25145658,ville1,"bni khiar",107,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"mohidine",25145658,ville3,"ouardanine",75,1,
		 * "Livré", date,null,null)); coliRepository.save(new
		 * Coli(null,reference,user13,"lamya",25145658,ville2,"ariana",105,1,"Livré",
		 * date2,null,null)); coliRepository.save(new
		 * Coli(null,reference,user14,"sondes",25145658,ville2,"mannouba",60,1,"Livré",
		 * date3,null,null)); coliRepository.save(new
		 * Coli(null,reference,user2,"samir",25145658,ville3,"manzel harb",88,1,"Livré",
		 * date3,null,null));
		 */
		
	}

	

}
