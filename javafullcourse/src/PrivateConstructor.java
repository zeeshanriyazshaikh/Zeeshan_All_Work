
public class PrivateConstructor {
int a; double b; String c; 
	private PrivateConstructor()          //private constructor (no other class can make object for this constructor except for above class...
	 {
		a=10; b=10.25; c="zeeshan";
		System.out.print(a+" "+b+" "+c);
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrivateConstructor r=new PrivateConstructor();
	}

}
