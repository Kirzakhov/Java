package collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;
	String dept;
	public Employee(int id, String name, double salary, String dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
}
class NameCompares implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}
class SalaryCompare implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.salary<o2.salary)
			return -1;
		else if(o1.salary>o2.salary)
			return 1;
		else 
			return 0;
	}
}

public class EmpTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(7, "Vivek", 50000, "be");
		Employee e2 = new Employee(10, "Vishal", 55000, "fe");
		Employee e3 = new Employee(9, "Kumar", 30000, "dev");
		TreeSet<Employee> ts = new TreeSet<Employee>(new SalaryCompare());
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		for(Employee e : ts)
			System.out.println(e.id +" "+ e.name+" "+e.salary+" "+e.dept);
			
	}

}
