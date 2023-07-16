package userVarification.otpvalidation;

import java.util.Random;

public class OtpGenerate {
	private static final String OTP_CHARACTER = "0123456789";
	private static final int OTP_LENGTH = 6;
	
	 public static String generateOTP() {
	        Random random = new Random();
	        StringBuilder otp = new StringBuilder(OTP_LENGTH);
	        
	        for (int i = 0; i < OTP_LENGTH; i++) {
	            int index = random.nextInt(OTP_CHARACTER.length());
	            otp.append(OTP_CHARACTER.charAt(index));
	        }
	        
	        return otp.toString();
	    }

}
