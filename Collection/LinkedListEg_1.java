package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEg_1 {
public static void main(String[] args) {
	LinkedList<String>color_list=new LinkedList<String>();//generic introduced after java 5 
	color_list.add("Red");
	color_list.add("Green");
	color_list.add("Black");
	System.out.println(color_list);
	Iterator<String>itr=color_list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	//adding an elemnt
	color_list.add(2,"Nisha");
	System.out.println("After adding"+color_list);
	
	LinkedList<String>ll=new LinkedList<String>();//generic introduced after java 5 
	ll.add("Javed");
	ll.add("Hill");
	ll.add("Joyee");
	//list 2 
	System.out.println("List2"+ll);
	ll.addAll(color_list);
	System.out.println("After adding all thhe elemnets of list 2"+ll);
	ll.addAll(2,color_list);
	System.out.println("After adding allthhe elemnets of list 2 at specified location"+ll);
	//adding elements at first
	ll.addFirst("Soumya");
	System.out.println("After adding at first"+ll);
	//adding last
	ll.addLast("Pallabi");
	System.out.println("After adding at last"+ll);
	

}
}
