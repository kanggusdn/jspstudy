package jsptest;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class GoogleAuthentication extends Authenticator {
	PasswordAuthentication passAuth;
	
	public GoogleAuthentication() {
		passAuth = new PasswordAuthentication("hhh", "jjj");
	}
	
	public PasswordAuthentication getPasswordAuthentication() {
		return passAuth;
	}
}
