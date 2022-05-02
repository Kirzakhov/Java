package oops;

class MyEmployee{
	int id;
	String name;
	static final String cname = "Pratap";
	public MyEmployee(int i, String string) {
		this.id = i;
		this.name = string;
	}
	public MyEmployee(MyEmployee s1) {
		this.id = s1.id;
		this.name = s1.name;
	}
	
	void display() {
		System.out.println("id = " + id);
		System.out.println("name  = "+name);
		System.out.println("College Name = "+cname);
	}
}
public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyEmployee s1 = new MyEmployee(1, "Vivek");
		MyEmployee s2 = new MyEmployee(s1);
		s1.display();
		s2.display();
	}

}
