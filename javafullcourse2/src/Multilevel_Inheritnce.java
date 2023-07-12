
class one                                                                 //super class
{
	int a,b,c;
	void add()
	{
		a=10; b=20; c=30;
		c=a+b;
		System.out.println("Sum of two number "+c);
	}
	void subtract()
	{
		a=10; b=20; c=30;
		c=a+b;
		System.out.println("Subtraction of two number "+c);
	}
}
class two extends one                                                       //sub 1 class extends super class
{
	void multiplication()
	{
	a=10; b=20; c=30;
	c=a*b;
	System.out.println("multiplication of two number "+c);
}
void division()
{
	a=10; b=20; c=30;
	c=a/b;
	System.out.println("division of two number "+c);
}
}
class three extends two                                              //sub 2 class extends sub 1 class
{
	void remainder()
	{
		a=10; b=20; c=30;               
		c=a%b;                                                       // % means modulus used for remainder
		System.out.println("remainder of two number "+c);
	}
}


public class Multilevel_Inheritnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
three r=new three();                                                  //object of sub class 2 has been created as it consist of all 3 class features sub1,2 and super class. 

r.add();
r.multiplication();
r.remainder();
r.division();
r.subtract();

	}

}
