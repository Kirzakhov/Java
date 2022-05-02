package oops;

class MySingleton{
	static MySingleton instance = null;
	int x;
	private MySingleton(int n) {
		this.x = n;
	}
	static MySingleton getInstance(int n) {
//		if(instance == null)
			instance = new MySingleton(n);
		return instance;
	}
}

public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySingleton a = MySingleton.getInstance(1);
		MySingleton b = MySingleton.getInstance(2);
		MySingleton c = MySingleton.getInstance(3);
		System.out.println(a.x);
		System.out.println(b.x);
		System.out.println(c.x);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
