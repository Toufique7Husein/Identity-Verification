package userVarification.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import userVarification.logincontrol.LoginControl;
import userVarification.models.Email;
import userVarification.models.Login;
import userVarification.otpvalidation.OtpGenerate;
import userVarification.otpvalidation.Otpvalidation;
import userVarification.service.UserService;
import userVarification.models.OTP;
import userVarification.models.User;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	
	private String emailGlo = "";
	private String otpCode = "";
	
	
	/* first page of the webapp 
	 * 
	 * */
	@RequestMapping("/")
	public String home() {
		System.out.println("Im in ");
		return "home";
	}

	/* it will render the inital login page 
	 * */
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	/*
	 * This method get user email
	 * Otp will be generated 
	 * this otp will pass to the next method, user is valid or not will be chacked
	*/
	@RequestMapping(path = "/otp", method = RequestMethod.POST)
	public String getEmailInfo(@ModelAttribute Email email, Model model) throws Exception {
	//	Otpvalidation.buildOtp(email.getEmail());
		
		String code = OtpGenerate.generateOTP();
		otpCode = code;
		emailGlo = email.getEmail();
		Otpvalidation.buildOtp(email.getEmail(), code);
		System.out.println(email);
	
		return "otp";
	}
	
	
	/* Data will come from otp.jsp
	 * sending otp code and user given otp code will be compared
	 * If otp could not match than it will render faildotp page
	 * Otherwise it allow to login or register to the user
	 * 
	 * */
	@RequestMapping(path = "/verify", method = RequestMethod.POST)
	public String verifyOtp(@ModelAttribute OTP otp, Model model) {
		System.out.println(emailGlo + " " + otpCode);
		System.out.println(otp);
		
		if (otpCode.equals(otp.getOtp())) {
			return "mainlogin";
		}
		return "faildOtp";
	}
	
	
	@RequestMapping("/signup")
	public String SignupPage() {
		return "signup";
	}
	
	@RequestMapping(path = "/userData", method = RequestMethod.POST)
	public String signUpManage(@ModelAttribute User user, Model mode) {
		user.setEmail(emailGlo);
		System.out.println(user);
		userService.createUser(user);
		return "mainlogin";
	}
	
	
	@RequestMapping(path = "/loginData", method = RequestMethod.POST)
	public String loginAccess(@ModelAttribute Login login, Model model) {
		System.out.println(login);
		System.out.print(userService.getList());
		java.util.List<User> ls = userService.getList();
		if (LoginControl.isLegal(login, ls)) {
			model.addAttribute("email", emailGlo);
			return "deshboard";
		}
		return "mainlogin";
	}
	
	
	
	
	
	
	
	
	
	
	
}
