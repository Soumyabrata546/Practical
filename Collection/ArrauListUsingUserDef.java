package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrauListUsingUserDef {
	public static void main(String[] args) {
Bank b=new Bank(12345,"Soumya",5000.06,20);
Bank b1=new Bank(12343,"Ram",700.06,20);
Bank b2=new Bank(12335,"Jam",3000.06,20);
Bank b3=new Bank(12325,"Shayam",2000.06,20);
Bank b4=new Bank(12355,"Gyan",5555.06,20);
Bank b5=new Bank(12344,"Lili",3126.06,20);

ArrayList<Bank>al=new ArrayList<Bank>();
al.add(b);
al.add(b1);
al.add(b2);
al.add(b3);
al.add(b4);
al.add(b5);

Iterator<Bank> itr=al.iterator();
while(itr.hasNext()) {
	Bank obj=(Bank)itr.next();
	System.out.println(obj.acno+" "+obj.csname+" "+obj.bal+" "+obj.csage);
}
	}
}
