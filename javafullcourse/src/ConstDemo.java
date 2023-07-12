
public class ConstDemo {
	int a; String name;
	/*ConstDemo()
	{
		a=0; name=null;
	}*/
	void show()
	{
		System.out.println(a+" "+name);
	}

	public static void main(String[] args) {
		
		ConstDemo ref=new ConstDemo();
 ref.show();
	}



}   
