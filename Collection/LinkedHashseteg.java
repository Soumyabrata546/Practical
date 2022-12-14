package Collection;

//import java.util.ArrayDeque;
import java.util.*;
//follows insertion order
public class LinkedHashseteg {
public static void main(String[] args) {
	LinkedHashSet<String>lhs=new LinkedHashSet<String>();
	lhs.add("ram");
	lhs.add("sam");
	lhs.add("Four");
	lhs.add("Five");
	System.out.println("Original Set="+lhs);
//removig specific element
	
	System.out.println(lhs.remove("ram"));
	System.out.println("Updated Set="+lhs);

	System.out.println(lhs.remove("six"));
	
}
}
