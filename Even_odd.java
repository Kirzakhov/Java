package mypack;
import java.io.*;

public class Even_odd {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int n = Integer.parseInt(br.readLine());
		String result = (n%2 == 0)?"even":"odd";
		System.out.println("The given number is " + result);
	}

}
