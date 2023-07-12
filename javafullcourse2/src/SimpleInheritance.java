 class student
{
	protected int roll,marks;      //private variable not accessible so private member are not inherited but protected are accessible
	String name;
	protected void input()        //private method not accessible,but protected are...
	{
		System.out.println("enter roll,name and marks");
	}
}
class ankit extends student
{
	void disp()
	{
		roll=1; name="ankit"; marks=89;
		System.out.println(roll+" "+name+" "+marks);
	}
}
public class SimpleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ankit r=new ankit();
r.input(); r.disp();
	}

}
