package excep;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		try {
			a[2] = 10;
			int z = 2/0;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
