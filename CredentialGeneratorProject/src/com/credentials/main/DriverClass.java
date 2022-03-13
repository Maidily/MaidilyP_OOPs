package com.credentials.main;

import java.util.Scanner;

import com.credentials.model.Employee;
import com.credentials.service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {

		String firstName, lastName;
		int department;
		
		CredentialService credential = new CredentialService();
		
		//get firstName and lastName user inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name : ");
		firstName = sc.nextLine();
		System.out.println("Enter your Last Name : ");
		lastName = sc.nextLine();
		
		Employee emp = new Employee(firstName, lastName);
		
		//get user department input
		do {
			System.out.println("Please enter the department from the following");
			System.out.println("1. Technical \n2. Admin \n3. Human Resource \n4. Legal");	
			department = sc.nextInt();
			sc.nextLine();
			
			//generate credentials based on user input
			switch(department) {
				case 1: credential.showCredentials(emp, "tech");
						break;
				case 2: credential.showCredentials(emp, "admin");
						break;
				case 3: credential.showCredentials(emp, "hr");
						break;
				case 4: credential.showCredentials(emp, "legal");
						break;
				default: System.out.println("Invalid Input!");
			}
		} while(department<0 || department>4);
		
		sc.close();

	}

}
