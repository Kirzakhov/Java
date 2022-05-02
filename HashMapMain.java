package collect;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<Long, String> hm = new HashMap<Long, String>();
//		hm.put(9430950391L, "Vivek");
//		hm.put(9661715903L, "Kumar");
//		hm.put(9876543210L, "John");
//		hm.put(9430950391L, "Vivek");
//		for(Map.Entry<Long, String> m : hm.entrySet())
//			System.out.println(m.getKey() + " : " + m.getValue());
//		LinkedHashMap<Long, String> hm = new LinkedHashMap<Long, String>();
		TreeMap<Long, String> hm = new TreeMap<Long, String>();
		hm.put(9430950391L, "Vivek");
		hm.put(9661715903L, "Kumar");
		hm.put(9876543210L, "John");
		hm.put(9430950391L, "Vivek");
		for(Map.Entry<Long, String> m : hm.entrySet())
			System.out.println(m.getKey() + " : " + m.getValue());
	}

}
