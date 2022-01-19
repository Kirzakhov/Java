package myString;

import java.util.Scanner;

public class CheckNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String s = sc.next();
		boolean flag = true;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(!(ch>='0' && ch<='9'))
				flag = false;
		}
		if(flag)
			System.out.println("Only numeric");
		else
			System.out.println("String contains alphabets");
		sc.close();
	}

}
