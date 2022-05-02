package oops;


public class CodeBlocks {
	static int n;
	static {
		n=10;
		System.out.println("Static block");
	}
	{
		n =7;
		System.out.println("Anonymous block");
	}
	CodeBlocks(){
		System.out.println("Constructor block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		CodeBlocks cb= new CodeBlocks();
		System.out.println(cb.n);
	}

}
