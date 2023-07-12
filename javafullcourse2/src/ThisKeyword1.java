




public class ThisKeyword1 {
	int a=10;
	void show()
	{
		System.out.println(this);        //this keyword in void show method does same as that of what r does explained below.
		
		                                 // hence , this keyword refers to current object inside a method or constructor
	}                                    // this key word refers current class elements
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ThisKeyword1 r=new ThisKeyword1();    //when ever class is created it has a unique reference id like ThisKeyword1@3fee733d so r in object created refers to same unique id of class. 


System.out.println(r);                  
r.show();                               //calling show method which will display class unique id 2 times 


	}

}
