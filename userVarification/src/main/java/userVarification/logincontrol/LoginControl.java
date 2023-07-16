package userVarification.logincontrol;

import java.util.*;
import userVarification.models.*;

public class LoginControl {
	public static boolean isLegal(Login login, List<User> ls) {
		for(User user: ls) {
			if (user.getEmail().equals(login.getEmail()) && user.getPassword().equals(login.getPassword())) {
				return true;
			}
		}
		
		return false;
	}

}
