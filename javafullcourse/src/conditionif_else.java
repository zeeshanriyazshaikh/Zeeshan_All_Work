import java.util.Scanner;

public class conditionif_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pwd;
		
		System.out.print("Enter the password:- ");
		Scanner obj=new Scanner(System.in);
		pwd=obj.nextInt();
if(pwd==7862)         //used when single condition true then print statement in if block and if false the print statement in else block
{
	System.out.println("My name:-Zeeshan ");
	System.out.println("My wife name:-Khansa ");
	System.out.println("My Mother name:-Naseem ");
	System.out.println("My Father name:-Riyaz ");
	
}
else
{
	System.out.print("yipeee you failed ");
}
}
	}


