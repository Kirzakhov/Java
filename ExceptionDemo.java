package excep;


public class ExceptionDemo {

	public static void parse(String s) {
		try {
			float f = Float.parseFloat(s);
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally Block");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parse("2.0f");
	}

}
