package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Hashmap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(101, "Mango");
		map.put(108, "Orange");
		map.put(105, "Bannana");
		map.put(103, "Grapes");
		map.put(102, "Chiku");
		map.put(null, null);

		map.put(101, null);
		map.put(null, "Apple");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());}
			System.out.println("---------------------");
			map.putIfAbsent(102, "Custard");
			map.putIfAbsent(101, "Watermellon");
			for(Map.Entry m:map.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());}
			map.remove(103);		
		}
	


	}
