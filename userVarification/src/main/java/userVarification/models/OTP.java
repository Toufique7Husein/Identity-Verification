package userVarification.models;

public class OTP {
	private String otp;

	public OTP(String otp) {
		super();
		this.otp = otp;
	}

	public OTP() {
		// TODO Auto-generated constructor stub
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	@Override
	public String toString() {
		return "OTP [otp=" + otp + "]";
	}
	
	
}
