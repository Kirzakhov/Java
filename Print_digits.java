package mypack;
import java.util.*;

public class Print_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum =0;
		int rem;
		while(n>0) {
			rem = n % 10;
			System.out.println(rem);
			sum += rem;
			n /= 10;
		}
		sc.close();
		System.out.println("Sum of digits is " +sum);
	}

}
