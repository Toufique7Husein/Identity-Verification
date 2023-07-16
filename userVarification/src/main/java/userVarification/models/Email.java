package userVarification.models;

public class Email {
	String email;
	
	

	public Email() {
		super();
	}

	@Override
	public String toString() {
		return "Email [email=" + email + "]";
	}

	public Email(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
