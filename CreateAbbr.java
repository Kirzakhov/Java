package myString;

public class CreateAbbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Vital Information Resource Under Seize";
		String a = "";
		for(int i = 0; i < s.length(); i++) {
			if(i==0)
				a += s.charAt(i);
			if(s.charAt(i) == ' ')
				a += s.charAt(i+1);
		}
		System.out.println(a);
	}

}
