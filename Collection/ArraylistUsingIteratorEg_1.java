package Collection;

import java.util.*;


public class ArraylistUsingIteratorEg_1 {
	public static void main(String[] args) {
		//List al1=new ArrayList(); non-generic
		List<String>al=new ArrayList<String>();//generic intriduced after java 5 onward
		al.add("Rose");
		al.add("Sunflower");
		al.add("Lily");
		//we can add element in any specified location
		al.add("Daisy");
		al.add("MarieGold");
		al.add("Tulip");
		al.add("Jasmine");
		al.add("Orchid");
		al.add("Lotus");
		al.add("lavender");
		
		System.out.println("using for loop:");
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
		
		System.out.println("using for each loop");
		for(String a:al)
			System.out.println(a);
		
		System.out.println("using iterator:");
		Iterator itr=al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("using iterator-forward:");
		ListIterator<String> itr1=al.listIterator();
		while(itr1.hasNext())
			System.out.println(itr1.next());
		
		System.out.println("using iterator-backward:");
		ListIterator<String> itr2=al.listIterator(al.size());
		while(itr2.hasPrevious())
			System.out.println(itr2.previous());
		
		System.out.println("traversing using forEach() method:");
		al.forEach(a->System.out.println(a));
}
}
