package oops;

interface MyInterface{
	int n = 7;
	void m1();
	void m2();
}
interface AnotherInterface extends MyInterface{
	void m4();
}
interface ThirdInterface{
	void m5();
}
class C implements AnotherInterface, ThirdInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("M1 method from C");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("M2 method from C");
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		System.out.println("M5 method from C");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("M4 method from C");
	}
	
}
class B implements AnotherInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("M1 method from B");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("M2 method from B");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("M4 method from B");
	}
	
}
class A implements MyInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("M1 method from A");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("M2 method from A");
	}
	void m3() {
		System.out.println("Class A method");
	}
	
}
public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.m1();
		a.m2();
		a.m3();
		B b = new B();
		b.m1();
		b.m2();
		b.m4();
		C c = new C();
		c.m1();
		c.m2();
		c.m4();
		c.m5();
		MyInterface mi = new A();
		mi.m1();
		mi.m2();
	}

}
