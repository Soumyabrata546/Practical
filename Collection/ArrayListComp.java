package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListComp {
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
		System.out.println(al);
		
		List<String>al1=new ArrayList<String>();//generic introduced after java 5 onward
		al1.add("Rose");
		al1.add("Sunflower");
		al1.add("Lily");
		//we can add element in any specified location
		al1.add("Daisy");
		al1.add("MarieGold");
		al1.add("Tulip");
		al1.add("Jasmine");
		al1.add("Orchid");
		al1.add("Lotus");
		al1.add("lavender");
		System.out.println(al1);
		boolean b=al.equals(al1);
		System.out.println(b);
		al1.add("Red Rose");
		boolean b1=al.equals(al1);
		System.out.println(b1);


}
}
