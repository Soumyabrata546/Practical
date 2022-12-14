package Collection;

import java.util.*;

public class Stackeg2 {
public static void main(String[] args) {
	Stack<Integer>s=new Stack<Integer>();//generic introduced after java 5 
	//checking emty or not
	System.out.println("Stack is:"+s);
	pushelement(s,15);
	pushelement(s,25);
	pushelement(s,45);
	pushelement(s,20);
	pushelement(s,30);
	//poping
	popelement(s);
	popelement(s);
	popelement(s);
	popelement(s);
	try {
		popelement(s);
		popelement(s);	

	}catch(EmptyStackException e) {
		System.out.println("Stack is empty");
	}
	}
private static void pushelement(Stack<Integer>s,int i) {
	//invoke push method
	s.push(new Integer(i));
	System.out.println("push is "+i);
	System.out.println("Stack is"+s);//modifeied stack
}
private static void popelement(Stack<Integer>s) {
	//invoke pop() method
	Integer i=(Integer)s.pop();
	System.out.println("Pop is "+i);
	System.out.println("Stack is"+s);//modifeied stack
}
}
