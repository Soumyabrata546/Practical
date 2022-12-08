package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConv {
	public static void main(String[] args) {
		//List al1=new ArrayList(); non-generic
		List<String>al=new ArrayList<String>();//generic introduced after java 5 onward
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
		//conv list to array
		System.out.println("List to array=");
		String []arr=al.toArray(new String[al.size()]);
		for(String s:arr)
		System.out.println(s);
		//arr to list
		System.out.println("Array to Lsit");
		List<String>all=new ArrayList<String>();
		all=Arrays.asList(arr);
		System.out.println(all);
}
}
