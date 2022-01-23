package mypack;
import java.util.*;

public class QueueUsingStack {
	Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    int dequeue()
    {
    	
	    if(input.isEmpty())
	        return 0;
	    while(!(input.isEmpty())){
	    	int a = input.pop();
	        output.push(a);
	    }
	    int res = output.pop();
	    while(!(output.empty()))
	    	input.push(output.pop());
	    return res;
    }
    
    void enqueue(int x)
    {
	    
	    input.push(x);
	    
    }
    void display() {
    	Iterator<Integer> itr = input.iterator();
    	while(itr.hasNext())
    		System.out.println(itr.next());
    	System.out.println(input.size());
    }

	public static void main(String[] args) {
		QueueUsingStack qus = new QueueUsingStack();
		qus.enqueue(10);
		qus.enqueue(20);
		qus.enqueue(30);
		qus.enqueue(40);
		qus.enqueue(50);
		qus.dequeue();
		qus.display();
		System.out.println("Done");
		
	}

}
