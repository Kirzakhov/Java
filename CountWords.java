package myString;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello how are you";
		int c = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ')
				c++;
		}
		System.out.println("Total numbe rof words: " + ++c);
	}

}
