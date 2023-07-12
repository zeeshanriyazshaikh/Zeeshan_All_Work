

public class Copy_Constructor {
int a=2,b=4;
	Copy_Constructor()
	{
		System.out.println(a+" "+b);
	}
	Copy_Constructor(Copy_Constructor ref)     //copy constructor with object reference
	{
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Copy_Constructor r=new Copy_Constructor(); //while initialising an object constructor gets called automatically
		Copy_Constructor s=new Copy_Constructor(r);    
		 
		
		
	}

}
