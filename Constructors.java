package myarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Product{
	int id;
	String name;
	float price;
	Product(){
		this.id = 1;
		this.name = "abc";
		this.price = 1.0f;
	}
	Product(int id, String name, float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class Constructors {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id, name & price of product");
		int id = Integer.parseInt(br.readLine());
		String name = br.readLine();
		float price = Float.parseFloat(br.readLine());
		Product p1 = new Product(id, name, price);
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.price);
		Product p2 = new Product();
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.price);
	}

}
