package collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListAssignment {
	private String[] names;
	private ArrayList<String> al;
	public ArrayListAssignment(int n) {
		this.names = new String[n];
		this.al = new ArrayList<String>();
	}
	void createNames() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < names.length; i++)
			names[i] = sc.nextLine();
		sc.close();
	}
	void removeDuplicates() {
		for(String str : names)
			if(!al.contains(str))
				al.add(str);
	}
	void display() {
		Iterator<String> itr = al.iterator();
//		Iterate through the list until it has elements
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of users");
		int n = sc.nextInt();
		ArrayListAssignment ala = new ArrayListAssignment(n);
		System.out.println("Enter the names to be inputed");
		ala.createNames();
		ala.removeDuplicates();
		System.out.println("Unique elements:-");
		ala.display();
		sc.close();
	}

}
