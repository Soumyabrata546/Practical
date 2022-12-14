package Collection;

import java.util.*;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>map2=new TreeMap<Integer,String>();
		map2.put(101, "Mango");
		map2.put(108, "Orange");
		map2.put(105, "Bannana");
		map2.put(103, "Grapes");
		map2.put(101, null);
//		map2.put(null, "Chiku");
		System.out.println(map2);
		map2.putIfAbsent(102, "Custard");
		map2.putIfAbsent(101, "Watermellon");
		System.out.println("---------------------");
		for(Map.Entry m:map2.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());}
		map2.remove(103);
		System.out.println("After Removal--------");
		for(Map.Entry m:map2.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());}
				
	}

}
