package accessSpecifier;

class A{
	int id;
	String name;
	A(){
		
	}
	A(int id, String name){
		this.id = id;
		this.name = name;
	}
	void display(){
		System.out.println("From Parent Class");
	}
	void myFunction() {
		
	}
}
class B extends A{
	B(){
		super();
	}
	protected void display() {
		System.out.println("From Child Class");
	}
	void myFunction1() {
		
	}
}
public class MyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		A obj = new A(12, "Vivek");
		B obj1 = new B();
		System.out.println(obj.name);
		System.out.println(obj1.name);
		obj1.display();
		A o = new B();
		o.myFunction();
	}

}
