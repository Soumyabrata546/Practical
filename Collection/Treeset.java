package Collection;

import java.util.*;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>ts=new TreeSet<String>();
		ts.add("A");
		ts.add("P");
		ts.add("Q");
		ts.add("S");
		ts.add("D");
		ts.add("B");
		ts.add("C");
		ts.add("Y");
		ts.add("Z");
		ts.add("N");
		ts.add(null);//null is not allowed in the treeset
System.out.println("Original List="+ts);
Iterator itr=ts.descendingIterator();
while(itr.hasNext()) {
	System.out.println(itr.next());}
System.out.println("Lowest Value:"+ts.pollFirst());
System.out.println("Original List="+ts);

System.out.println("Highest Value:"+ts.pollLast());
System.out.println("Original List="+ts);

System.out.println("Reverse set="+ts.descendingSet());
	//sorted set operation
System.out.println("Head set="+ts.headSet("D"));//prints char only smaller than D's ascii value
System.out.println("Original List="+ts);

System.out.println("Sub set="+ts.subSet("C","N"));//prints chars from C(Including) upto N(Excluding)
System.out.println("Tail set="+ts.tailSet("A"));

	}
	}

