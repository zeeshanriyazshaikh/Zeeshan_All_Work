import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter any number: ");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		
		while(num>=0)                 //used when we do not know how many time output is going to be repeated
		{
			if(num%2==0)             //it means number inputed by user is divided by 2 and checking if num is equal to zero
			{
				System.out.println("Entered number is even");
				break;
			}
			else
			{
				System.out.println("Entered number is odd");
				break;
			}
			
			}
		
		
		System.out.println("while loop ended"); //it will show up if invalid input is entered
		}
	}


