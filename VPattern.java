package mypack;

import java.util.Scanner;

public class VPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the height of V");
		int n = sc.nextInt();
		int k = 2*(n-1);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k; j++) {
				if(i == j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			k--;
			System.out.println("*");
		}
		sc.close();
	}

}
