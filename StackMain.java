package collect;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack<>();
		st.push("one");
		st.push("two");
		st.push("three");
		st.push("four");
		System.out.println(st.search("two"));
	}
}
