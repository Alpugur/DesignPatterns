package org.patterndesign.srp;

public class EmailServiceImpl implements EmailService {

	@Override
	public void sendEmail(Customer customer) {
		System.out.println("Email service running...");
	}

}
