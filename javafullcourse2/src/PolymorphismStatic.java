                                               // METHOD OVERLOADING//
class add
 {
	 int add()
	 {
		int a=10,b=20,c;
		c=a+b;
		return c;
	 }
	 void add(int x,int y)
	 {
		 x=100; y=200;
		 System.out.println(x+y);
		 
	 }
	 void add(int x,double y)
	 {
		 double z;
		 z=x+y;

		 System.out.println(z);
		 
	 }
 }
public class PolymorphismStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add r=new add();

int a=r.add();

r.add(10,20);
r.add(10,10.5);
System.out.println(a);

	}

}
