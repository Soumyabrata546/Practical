package PallabiMaam;

public class ArrayExample {
	public static void main(String[] args) {
		
	
String [] names= {"pallabi","shifa","niladri","Soumya"};
//for loop 
for(int i=0;i<names.length;i++) {
	System.out.println(names[i]);
}
System.out.println();
int [] phone= {123,456,567,768,2345,7890};
//for each loop
for(int n:phone)
	System.out.println("hello"+n);
}
}
