package mypack;
import java.io.*;

public class Pos_neg {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int n = Integer.parseInt(br.readLine());
		String result = (n>0)?"positive":"negative";
		System.out.println("The given number is " + result);
		
	}
}
