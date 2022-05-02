package collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<Integer>();
		al.add(56);
		al.add(56);
		al.add(56);
		al.add(56);
		Iterator<Integer> itr = al.iterator();
		int count = 0;
		while(itr.hasNext()) {
			if(itr.next().equals(56))
				count++;
		}
		System.out.println("56 is present "+ count +" times" );
		al.add(1, 65);
		al.add(3, 34);
		al.set(0, 77);
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext())
			System.out.println(li.next());
		System.out.println("----------------------");
		while(li.hasPrevious())
			System.out.println(li.previous());
	}

}
