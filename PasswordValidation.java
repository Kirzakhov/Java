package myString;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		int i;
		for(i = 0; i < 3; i++) {
			if(username.equalsIgnoreCase("vivek") && password.equals("vivek123")) {
				System.out.println("Login successful");
				break;
			}
			else {
				System.out.println("Invalid credentials");
				System.out.println((3-i-1) + " attempts left");
			}
			if(i<2) {
				System.out.println("Enter username");
				username = sc.next();
				System.out.println("Enter password");
				password = sc.next();
			}
		}
		if(i == 3)
			System.out.println("Please try again after 24 hours");
		
		sc.close();
		
	}
}
