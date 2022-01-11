package mypack;
import java.util.*;
public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of square in cm");
		float side = sc.nextFloat();
		System.out.println("Area of square is " + (side*side) + " square cm");
		System.out.println("Enter length & width of rectangle in cm");
		float length = sc.nextFloat();
		float width = sc.nextFloat();
		System.out.println("Area of rectangle is " + (length * width) + " square cm");
		System.out.println("Enter radius of circle in cm");
		float radius = sc.nextFloat();
		System.out.println("Area of circle is " + (Math.PI * radius * radius) + " square cm");
		System.out.println("Enter base and height of triangle in cm");
		float base = sc.nextFloat();
		float height = sc.nextFloat();
		System.out.println("Area of triangle is " + (base * height)/2 + " square cm");
		sc.close();
	}

}
