package Collection;

import java.util.*;

public class DeQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque<String>dq=new ArrayDeque<String>();
dq.add("Ram");
dq.add("Sam");
dq.add("Jyoti");
dq.add("Sam");
dq.add("Ajay");
System.out.println(dq);
dq.addFirst("Shree");
dq.addLast("Riya");
System.out.println("New List");
for(String s1:dq) {
	System.out.println(s1);
}
System.out.println("After Removal="+dq);
	}

}
