package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Dequeue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank(12345,"Soumya",5000.06,20);
		Bank b1=new Bank(12343,"Ram",700.06,20);
		Bank b2=new Bank(12335,"Jam",3000.06,20);
		Bank b3=new Bank(12325,"Shayam",2000.06,20);
		Bank b4=new Bank(12355,"Gyan",5555.06,20);
		Bank b5=new Bank(12344,"Lili",3126.06,20);
		Deque<Bank>dq=new ArrayDeque<Bank>();
		dq.add(b);
		dq.add(b1);
		dq.add(b2);
		dq.add(b3);
		dq.add(b4);
		dq.add(b5);
		Iterator<Bank> itr=dq.iterator();
		while(itr.hasNext()) {
			Bank obj=(Bank)itr.next();
			System.out.println(obj.acno+" "+obj.csname+" "+obj.bal+" "+obj.csage);
		}

	}

}
