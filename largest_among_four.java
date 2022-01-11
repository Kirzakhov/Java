package mypack;
import java.util.*;

public class largest_among_four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		System.out.println("Enter four numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		//int largest = (a>b)?(a>c)?(a>d)?a:(b>c)?(b>d)?b:(c>d)?c:d;
		int largest = (a>b && a>c && a>d)?a: (b>c && b>d)?b: (c>d)?c:d;
		System.out.println("The largest number is " + largest);
		sc.close();
	}

}
