package accessSpecifier;

public class Person {
	public String name;
	private char gen;
	protected String loc;
	int contact;
	public Person(String name, char gen, String loc, int con) {
		this.name = name;
		this.gen = gen;
		this.loc = loc;
		this.contact = con;
	}

}
