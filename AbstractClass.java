package oops;


abstract class Animal{
	void sleep(){
		System.out.println("ZZzzz");
	}
	abstract void eat();
}
class Lion extends Animal{
	void eat() {
		System.out.println("Meat");
	}
	void isCarnivore() {
		System.out.println("Yes");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l = new Lion();
		l.isCarnivore();
		Animal a = new Lion();
		a.eat();
	}

}
