package mypack;
import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your qualification");
		String qualification = sc.next();
		System.out.println("Enter your fees");
		float fees = sc.nextFloat();
		
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);
		System.out.println("My qualification is " + qualification);
		System.out.println("My fees is " + fees);
		sc.close();
	}
}
