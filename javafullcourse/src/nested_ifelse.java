import java.util.Scanner;

public class nested_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2,num3;
System.out.println("Enter number");
Scanner obj=new Scanner(System.in);
num1=obj.nextInt();
num2=obj.nextInt();
num3=obj.nextInt();

	if(num1>num2)                                //if_else statements under if_else
	{
		if(num1>num3)
			
		{
			System.out.println("Maximum:- "+num1);
		}
		else
		{
			System.out.println("Maximum:- "+num3);
		}
		
	}
	else
	{
		if(num2>num3)
		{
			System.out.println("Maximum:- "+num2);
		}
		else
		{
			System.out.println("Maximum:- "+num3);
		}
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
