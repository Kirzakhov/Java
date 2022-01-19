package myString;
import java.util.Scanner;

public class VoweltoNextWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String st = sc.next();
		st = st.toLowerCase();
		StringBuilder s = new StringBuilder(st);
		for(int i = 0; i < s.length()-1; i++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u')
				s.replace(i, i+1, Character.toString(ch+1));
		}
		System.out.println(s);
		sc.close();
	}
}
