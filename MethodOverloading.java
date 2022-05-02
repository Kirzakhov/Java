package oops;
import java.io.*;

class Area{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	void squareArea() throws NumberFormatException, IOException {
		System.out.println("Enter side of square");
		int side = Integer.parseInt(br.readLine());
		int area = side * side;
		System.out.println("Area of square = " +area);
	}
	float circleArea(float radius) {
		float area = (float)(Math.PI * radius * radius);
		return area;
	}
	int rectangleArea(int l, int b) {
		int area = l * b;
		return area;
	}
}

public class MethodOverloading {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Area a = new Area();
		a.squareArea();
		System.out.println("Enter radius of circle");
		float rad = Float.parseFloat(a.br.readLine());
		float res = a.circleArea(rad);
		System.out.println("Area of circle = " +res);
		System.out.println("Enter length & breadth of rectangle");
		int l = Integer.parseInt(a.br.readLine());
		int b = Integer.parseInt(a.br.readLine());
		int ans = a.rectangleArea(l, b);
		System.out.println("Area of rectangle = " +ans);
	}

}
