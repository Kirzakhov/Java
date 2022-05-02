package collect;

import java.util.ArrayDeque;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		System.out.println(ad);
		ad.addFirst(9);
		ad.addLast(50);
		ad.addFirst(7);
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad);
		System.out.println(ad.pollLast());
		System.out.println(ad);
	}

}
