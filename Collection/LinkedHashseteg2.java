package Collection;

//import java.util.ArrayDeque;
import java.util.*;

public class LinkedHashseteg2 {
public static void main(String[] args) {
	Set<String>lhs=new LinkedHashSet<String>();
	lhs.add("ram");
	lhs.add("sam");
	lhs.add("Four");
	lhs.add(null);
	lhs.add("six");
	lhs.add("Eight");
	Iterator<String>it=lhs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());

	}
}
}
