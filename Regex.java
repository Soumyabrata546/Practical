package PallabiMaam;

import java.util.regex.*;


public class Regex {
public static void main(String[] args) {
	Pattern p=Pattern.compile(".a");//single dot means single character
	Matcher m=p.matcher("ma");
	boolean b=m.matches();
	
	//2nd way
	boolean bb=Pattern.compile("..m").matcher("am").matches();
	//3rd way
	boolean b1=Pattern.matches(".a","sa");// recomended one ("compile","matcher");
//	System.out.println(b+" "+bb+" "+b1);
	//character class
	boolean b5=Pattern.matches("[a-zA-Z]","A");//any char from A-Z and a-z
	boolean b3=Pattern.matches("[pqr]","pqr");//false //ony single representation only p,q,r
	boolean b4=Pattern.matches("[^abcA]","A");//^except these characters
//	System.out.println(b5+" "+b3+" "+b4);
	//Quantifiers
	/*x?-  x   occurs once or not at all x+ : x occurs  once or more than one
*comment   x* - x || zero or more; x{n} -- x occur n time x{7} only 7
	 *x{n,} -- x occur n or more time 
	 * 
	 */
	boolean b7=Pattern.matches("[a-zA-Z0-9]*","Anudip123ppp");
//	System.out.println(b7);
	//Meta char----/d=0-9 /s--white space char, /w-- [a-zA-Z0-9]
	//match any phone number
	boolean b9=Pattern.matches("[6789]{1}[0-9]{9}","8927974283");
//	System.out.println(b9);
	boolean b10=Pattern.matches("[a-z0-9_]+[@][a-z]+[.]{1}com","sb_rata122@yahoo.com");//can check any email
	//@ only 1 time allowed 
	System.out.println(b10);
}
}
