package Collection;

import java.util.*;

public class Stackeg {
public static void main(String[] args) {
	Stack<Integer>s=new Stack<Integer>();//generic introduced after java 5 
	//checking emty or not
	boolean res=s.isEmpty();
	System.out.println("is stack empty:"+res);
	//adding element
	s.push(25);
	s.push(35);
	s.push(40);
	s.push(80);
	s.push(20);
	s.push(75);
	

	System.out.println("Stack elements="+s);
	Integer digit=s.peek();//access element from top of the stack
	System.err.println("Top element"+digit);
	System.out.println("Stack ="+s);
	Integer digit2=s.pop();//access element from top of the stack and removes it
	System.err.println("Top element"+digit2);
	System.out.println("Stack ="+s);
	int dig=s.search(35);
	//serch element
	System.out.println("Serche element"+dig);
	int x=s.size();
	System.out.println("Stack size"+x);
}
}
