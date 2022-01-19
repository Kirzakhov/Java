package myString;

public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bOolean";
		s = s.toLowerCase();
		boolean flag = true;
		outer:
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < s.length(); j++) {
				if(i == j)
					continue;
				if(s.charAt(i) == s.charAt(j)) {
					flag = false;
					break outer;
				}
			}
		}
		if(flag)
			System.out.println("Unique");
		else
			System.out.println("Not unique");
	}

}
