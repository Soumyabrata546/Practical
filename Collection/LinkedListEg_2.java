package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>color_list=new LinkedList<String>();//generic introduced after java 5 
		color_list.add("Red");
		color_list.add("Green");
		color_list.add("Black");
		System.out.println("Firstlist"+color_list);
		//list 2
		LinkedList<String>ll2=new LinkedList<String>();//generic introduced after java 5 
		ll2.add("Peso");
		ll2.add("Atif");
		ll2.add("Niladri");
		System.out.println("List2"+ll2);
		//adding all  first list in ll2 in
		ll2.addAll(color_list);
		System.out.println("After adding"+ll2);
		//removinh
		ll2.remove("Niladri");
		ll2.remove(1);//atif will be delted
		ll2.removeFirst();
		System.out.println("After removing"+ll2);
		ll2.removeFirst();
		System.out.println("After removing first"+ll2);
		ll2.removeLast();
		System.out.println("After removing last"+ll2);
		ll2.add("Pallabi");
		ll2.add("Java");
		ll2.add("Collection");
		ll2.add("Pallabi");
		System.out.println("After Upadted list"+ll2);
		//remove first occurance of element
		ll2.removeFirstOccurrence("Pallabi");
		System.out.println("After Removing First Occurance"+ll2);
		//remove last occurance of element
			ll2.removeLastOccurrence("Pallabi");
			System.out.println("After Removing Last Occurance"+ll2);
			//Traversing the list of elements in reverse order
			Iterator i=ll2.descendingIterator();
			System.out.println("In descending Order");

			while(i.hasNext()) {
				System.out.println(i.next());
	
			}
			
			System.out.println("Hi");
			ll2.clear();
			Iterator i1=ll2.iterator();
			while(i1.hasNext()) {
				System.out.println(i1.next());
	
			}
	}

}
