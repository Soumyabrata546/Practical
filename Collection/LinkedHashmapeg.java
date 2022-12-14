package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmapeg{
//follows insertion order
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String>map=new LinkedHashMap<Integer,String>();
		map.put(104, "Mango");
		map.put(108, "Orange");
		map.put(105, "Bannana");
		map.put(103, "Grapes");
		map.put(102, "Chiku");
		map.put(null, null);
		map.put(101, null);
		map.put(null, "Apple");
		System.out.println(map);
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());}
			System.out.println("---------------------");
			map.putIfAbsent(102, "Custard");
			map.putIfAbsent(101, "Watermellon");
			for(Map.Entry m:map.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());}
			System.out.println("keys="+map.keySet());
			//key
			System.out.println("VAlues="+map.values());
			//value
			System.out.println("keys & values="+map.entrySet());
			//key-value
			map.remove(103);
			System.out.println("After Removal");
			for(Map.Entry m:map.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());}
				
	}
	


	}
