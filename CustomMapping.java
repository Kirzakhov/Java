package collect;

import java.util.HashMap;
import java.util.Map;

public class CustomMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(7, "Vivek", 50000, "be");
		Employee e2 = new Employee(10, "Vishal", 55000, "fe");
		Employee e3 = new Employee(9, "Kumar", 30000, "dev");
		HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
		hm.put(3, e1);
		hm.put(2, e2);
		hm.put(1, e3);
		System.out.println(hm);
		for(Map.Entry<Integer, Employee> m : hm.entrySet()) {
			Employee a = m.getValue();
			System.out.println(m.getKey() + " " + a.id+" "+a.name);
		}
	}

}
