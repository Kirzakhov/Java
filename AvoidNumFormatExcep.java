package collect;

import java.util.Scanner;

public class AvoidNumFormatExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		if(sc.hasNextInt()) {
			int x = sc.nextInt();
			System.out.println(x);
		}
		else {
			System.out.println("Enter a number");
		}
		sc.close();
	}

}
