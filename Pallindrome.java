package mypack;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a word");
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		int n = sb.length();
//		int n = s.length();
//		char[] ch = s.toCharArray();
//		boolean flag = true;
//		for(int i = 0; i < n/2; i++) {
//			if(!(s.charAt(i) == ch[n-i-1]))
//				flag = false;
//		}
//		if(flag)
//			System.out.println("Pallindrome");
//		else
//			System.out.println("Not a Pallindrome");
		String s1 = sb.reverse().toString();
		System.out.println(s.equals(s1)?"Pallindrome":"Not Pallindrome");
		sb.setCharAt(n-1, Character.toUpperCase(sb.charAt(n-1)));
		System.out.println(sb);
		sc.close();
		
	}

}
