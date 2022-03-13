package com.credentials.service;

import java.util.Random;

import com.credentials.model.Employee;

public class CredentialService {

private String generatePassword() {
		
		String password = "";
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lchars = "abcdefghijklmnopqrstuvwxyz";
		String splChars = "!@#$%&*()-':;.,<>?|";
		
		Random r = new Random();
		
		for(int i=0; i<2; i++) {
			password = password + r.nextInt(10);
			password = password + chars.charAt(r.nextInt(chars.length()));
			password = password + splChars.charAt(r.nextInt(splChars.length()));
			password = password + lchars.charAt(r.nextInt(lchars.length()));
		}	
		
		return password;
	}
	
	private String generateEmailAddress(Employee employee, String department) {
		
		return employee.getFirstName().toLowerCase()+employee.getLastName().toLowerCase()+"@"+department+".abc.com";
	}
	
	public void showCredentials(Employee employee, String department) {
		
		System.out.println("Dear "+ employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email    ---> " + generateEmailAddress(employee, department));
		System.out.println("Password ---> " + generatePassword());
		
	}

}
