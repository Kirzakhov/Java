package mypack;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer:
		for(int i = 25; i < 100; i++) {
			for(int j = 2; j < 10; j++) {
				if(i%j==0)
					continue outer;
			}
			System.out.println(i);
		}
	}

}
