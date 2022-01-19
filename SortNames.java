package myString;
import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of names");
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++)
			str[i] = sc.next();
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(str[j+1].compareTo(str[j])<0) {
					String temp = str[j+1];
					str[j+1] = str[j];
					str[j] = temp;
				}
			}
		}
		for(String s : str)
			System.out.println(s);
		sc.close();
	}

}
