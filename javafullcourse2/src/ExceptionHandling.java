
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("main method started");

int a=10,b=0,c;
try
{
c=a/b;
System.out.println(c);
}
catch(Exception e)
{
	System.out.println(e);                   //we cannot divide number by 0 ,hence its throwing error (/ by zero) but then too last program is running without err
}
System.out.println("main method started");
	}
	

}
