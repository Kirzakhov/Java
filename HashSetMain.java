package collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("red");
		al.add("green");
		al.add("blue");
		al.add("red");
		al.add("green");
		al.add("yellow");
		System.out.println(al);
		Set<String> set = new HashSet<String>(al);
		System.out.println(set);
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("Vivek");
		set1.add("Deeksha");
		set1.add("Vishal");
		set1.add("Krishna");
		set1.add("Vivek");
		Iterator<String> itr = set1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		Iterator<String> it = set1.descendingIterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
