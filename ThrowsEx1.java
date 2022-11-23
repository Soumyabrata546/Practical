package PallabiMaam;
//Checked exception
import java.io.IOException;

public class ThrowsEx1 {
void show()throws IOException{
	throw new IOException("throw exception");
//it is throwing an error
	//which we are need handle in catch block
}
void display()throws IOException{
	show();
}
void fetch() {
	try {
		display();
	}catch(Exception e) {
		System.out.println("exception solved");
	}
	//throws is used to handle exception and indicate 
}
public static void main(String[] args) throws IOException {
	ThrowsEx1 ex1=new ThrowsEx1();
	ex1.fetch();
	//if we call a method that declares an exception, then we must declare the exception on main
//	ex1.display();
	
	System.out.println("the end");
}
}
