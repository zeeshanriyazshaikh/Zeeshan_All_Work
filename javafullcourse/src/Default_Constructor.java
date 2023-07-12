
public class Default_Constructor
{
int a; String b; boolean c;

	/*Default_Constructor()      //Default  constructor gives output  0 null false always by default
	{
		a=9; b="zeeshan"; c=true;                    //method of constructor {}
	}*/
	void Disp()
	{
		System.out.print(a+" "+b+" "+c);        //print statement can also be written in above constructor body or method once written thn no need of s.Disp(); and void Disp()
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Default_Constructor s=new Default_Constructor();
		s.Disp();
	}

}
	
