package mypack;

import java.util.Scanner;

public class CountOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a word");
		String s = sc.next();
		int n = s.length();
		for(int i = 0; i < n; i++) {
			int c = 1;
			for(int j = 0; j < n; j++) {
				if(i==j)
					continue;
				if(s.charAt(i)==s.charAt(j))
					c++;
			}
			System.out.println(s.charAt(i) + " : " + c);
		}
		sc.close();

	}

}
