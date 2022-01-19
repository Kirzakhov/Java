package myString;

public class MaxVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Happy New Year";
		s = s.toUpperCase();
		String[] str = s.split(" ");
		int max = 0;
		int ind = 0;
		for(int i = 0; i < str.length; i++) {
			int c = 0;
			for(int j = 0; j < str[i].length(); j++) {
				char ch = str[i].charAt(j);
				if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
					c++;
			}
			if(c > max) {
				max = c;
				ind = i;
			}
		}
		System.out.println(str[ind]);
	}

}
