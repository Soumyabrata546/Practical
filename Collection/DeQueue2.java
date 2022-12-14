package Collection;

import java.util.*;

public class DeQueue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque<String>dq=new ArrayDeque<String>();
dq.add("Pallabi");
dq.add("Sam");
dq.add("Jyoti");
dq.add("Sam");
dq.add("Ajay");
dq.offerFirst("Anju");//same as addFirst used for capacity restricted dequeue
System.out.println("After offer First"+dq);
dq.offerLast("Shree");
System.out.println("After offer Last"+dq);
for(String s1:dq) {
	System.out.println(s1);
}//dq.peek() and dq.peekFirst is same
System.out.println("PeekLast:"+dq.peekLast());
System.out.println("After Peek Last"+dq);
System.out.println("Poll: "+dq.pollLast());
System.out.println("After Poll Last: "+dq);

//System.out.println("After Removal="+dq);
	}

}
