package oops;

import accessSpecifier.Person;

public class Student extends Person{
	int id;
	Student(String name, char gen, String loc, int con, int id){
		super(name, gen, loc, con);
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Vivek", 'M', "Patna", 94309, 7);
		System.out.println(s1.loc); //public
		System.out.println(s1.name); //protected
		System.out.println(s1.id); //default
	}

}
