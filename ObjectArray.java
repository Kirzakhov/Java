package oops;
import java.io.*;

class Employee{
	String name;
	int id;
	String depName;
	float salary;
	char gen;
	void setDetails() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name, id, department name, salary, gender of employee");
		name = br.readLine();
		id = Integer.parseInt(br.readLine());
		depName = br.readLine();
		salary = Float.parseFloat(br.readLine());
		gen = br.readLine().charAt(0);
	}
	void getDetails() {
		System.out.println("Name = " +name);
		System.out.println("Id = " +id);
		System.out.println("Department = " +depName);
		System.out.println("Salary = " +salary);
		System.out.println("Gender = " +gen);
	}
	static void findMaxSalary(Employee arr[], int n) {
		int ind = -1;
		float max = Float.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			if(arr[i].salary>max) {
				max = arr[i].salary;
				ind = i;
			}	
		}
		arr[ind].getDetails();
	}
}

public class ObjectArray {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("Enter number of entries");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Employee arr[] = new Employee[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new Employee();
			arr[i].setDetails();
		}
		Employee.findMaxSalary(arr, n);
		
	}

}
