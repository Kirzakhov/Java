package myString;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Computer@is@Fun";
		
		String[] str = s.split("\\@");
		
		String res = "";
		for(int i = str.length-1; i >= 0; i--) {
			if(i!=0)
				res += str[i] + ".";
			else
				res += str[i];
		}
		System.out.println(res);
		System.out.println("\"Vivek Kumar\"");
	}

}
