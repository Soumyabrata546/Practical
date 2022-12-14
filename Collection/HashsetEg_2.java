package Collection;

//import java.util.ArrayDeque;
import java.util.*;

public class HashsetEg_2 {
public static void main(String[] args) {
	HashSet<String>s1=new HashSet<String>();
	s1.add("ram");
	s1.add("sam");
	s1.add("rima");
	s1.add("ramesh");
	System.out.println("Original Set="+s1);
//removig specific element
	s1.remove("ram");
	System.out.println("After Removing list="+s1);
	HashSet<String>s2=new HashSet<String>();
s2.add("Pallabi");
s2.add("Rahul");
System.out.println("New Set="+s2);
s1.addAll(s2);
System.out.println("Updated Set="+s1);
//removing all elements
s1.removeAll(s2);
System.out.println("Updated Set1 After Remove all="+s1);
s1.clear();

System.out.println("Updated Set1 After Clear="+s1);
	
}
}
