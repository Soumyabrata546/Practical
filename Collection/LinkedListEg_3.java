package Collection;

import java.util.LinkedList;

public class LinkedListEg_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>ll=new LinkedList<String>();//generic introduced after java 5 
		ll.add("Javed");
		ll.add("Hill");
		ll.add("Joyee");
		ll.add("Atif");
		ll.add("Kim Jong Wung");
		System.out.println("Link List is="+ll);
		//Retrive 1st Element
		System.out.println("Peeking:"+ll.peek());
		//Retrive 1st Element
				System.out.println("PeekFirst:"+ll.peekFirst());
			//Retrive last Element
			System.out.println("PeekLast:"+ll.peekLast());
			//Retrieves and removes the head (first element) of this list
			System.out.println("Poll:"+ll.poll());
			//Retrieves and removes the head (first element) of this list
			System.out.println("Link List is="+ll);
			System.out.println("PollFisrt:"+ll.pollFirst());
//Retrieves and removes the last element of this list,or returns null if this list is empty.
			System.out.println("Link List is="+ll);

			System.out.println("Polllast:"+ll.pollLast());
//Pops an element from the stack represented by this list. In otherwords, removes and returns the first element of this list. 
			System.out.println("Pop:"+ll.pop());
			System.out.println("Link List is="+ll);

	}

}
