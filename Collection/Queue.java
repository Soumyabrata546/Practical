package Collection;

import java.util.*;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String>pq=new PriorityQueue<>();
		pq.add("Prakash");
		pq.add("Babai");
		pq.add("Snakhajit");
		pq.add("Hassan");
		pq.add("Oswan");
		System.out.println("Queue is="+pq);

		System.out.println("Head=:"+pq.element());
		System.out.println("Head :"+pq.peek());
//		Iterator i=pq.iterator() ;
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		System.out.println("Head After Poll="+pq.poll());
		System.out.println("Queue is:"+pq);
		System.out.println("Head="+pq.remove());
		System.out.println("Queue is="+pq);

	}

}
