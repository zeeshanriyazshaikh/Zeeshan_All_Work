class A                          // super class
{
	void show()                 // used method to display output when out of main method
	{
		System.out.println("a");
	}
	

}
class B extends A               //sub-class
{
	
	void show()                                          //to call constructor void show()  will be replaced by B() and A() respectively and super to be written under ...
	{                                                    //...constructor method for ex:super(); but if not written then compiler writes on its own in default constructor case only.
		
		System.out.println("ab");
		super.show();                   //can write super.zeeshan(); in this and class a name constructor void zeeshan()  name as  well                      //when written above S.O.P then output of class A will be shown first and then class B.
		
	}
	
}
public class SuperKeyword {                                      //super keyword used to call all 3 variables,method,constructor etc.through sub-class object

	public static void main(String[] args) {                     //main method
		// TODO Auto-generated method stub
B r=new B();                                                     //sub-class or class B object
r.show();
	}
 
}