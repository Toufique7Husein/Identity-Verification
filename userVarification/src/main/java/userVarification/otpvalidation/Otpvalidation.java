package userVarification.otpvalidation;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Otpvalidation {

	public static void buildOtp(String reception, String code) throws Exception {
		
		System.out.println("Preparing To send email");
		Properties prp = new Properties();

		prp.put("mail.smtp.auth", true);
		prp.put("mail.smtp.starttls.enable", true);
		prp.put("mail.smtp.host", "smtp.gmail.com");
		prp.put("mail.smtp.port", "587");

		final String myAccountEmail = "eequaltomcsqr@gmail.com";
		final String password = "bewdgeyvuvqkwzhm";

		Session session = Session.getInstance(prp, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(myAccountEmail, password);
			}

		});
		
		Message message = prepareMassage(session, myAccountEmail, reception, code);
		
		Transport.send(message);
		System.out.println("Message Sent Succesfully");
		

	}

	public static Message prepareMassage(Session session, String myAE, String reception, String code) {
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(myAE));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(reception));
			message.setSubject("Your OTP is here");
			message.setText("Hey there please confirm your email using this code " + code);
			return message;
			
		}catch (Exception e) {
			//java.util.logging.Logger.getLogger(JavaMailUtil, reception)
		}
		
		
		return null;
	}
}
