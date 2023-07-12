

import org.apache.commons.codec.binary.Base64;

public class second {

	int a=10;   //instance variable ,                            it written under class body but not under method body
	static double b=20.5;    //static varaible ,                 no need object creation to run it
	
	
	public static void main(String[] args) {                     //main method
		// TODO Auto-generated method stub

		boolean c=true;   // loacal varaible ,                   written under block,group or method
		
		second s=new second();       //object created for variable a as it is instance variable
		
		System.out.println(s.a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(s.a+" "+b+" "+c);    //we can print in single line by giving spaces
		
		
	}

}
