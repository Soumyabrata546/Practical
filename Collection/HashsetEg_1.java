package Collection;

//import java.util.ArrayDeque;
import java.util.*;
//Hashset Allows null values but no duplicate values, if done then gets overidden the old value
public class HashsetEg_1 {
public static void main(String[] args) {
	Set<String>s4=new HashSet<String>();
	s4.add("Ac");
	s4.add("Pencil");
	s4.add("Phone");
	s4.add(null);
	s4.add("Ac");
	s4.add("Bottle");
	s4.add("Pen");
	s4.add("Bottle");
	s4.add("Earphones");

	Iterator <String>it=s4.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
