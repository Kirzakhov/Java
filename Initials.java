package myString;

import java.util.Scanner;

public class Initials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s = sc.nextLine().trim();
		s.toUpperCase();
		for(int i = 0; i < s.length(); i++) {
			if(i == 0)
				System.out.print(s.charAt(i) + ". ");
			if(s.charAt(i) == ' ')
				System.out.print(s.charAt(i+1) + ". ");
		}
		sc.close();
	}

}
