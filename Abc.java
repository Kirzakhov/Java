package mypack;

import java.util.HashSet;
import java.util.Set;

public class Abc {
	
	public static int uniqueVowel(String s) {
		Set<Character> set = new HashSet<Character>();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch=='u') {
				set.add(ch);
			}
		}
		return set.size();
	}
	public static int uniqueConsonant(String s) {
		Set<Character> set = new HashSet<Character>();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch!='a' || ch != 'e' || ch != 'i' || ch != 'o'|| ch!='u') {
				set.add(ch);
			}
		}
		return set.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbaabbc";
		int a = uniqueVowel(s);
		int b = uniqueConsonant(s);
		System.out.println(a);
		System.out.println(b);
	}
}
