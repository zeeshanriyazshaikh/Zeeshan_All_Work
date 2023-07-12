import java.util.Scanner;

public class arithmaticoperator_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,ch;
		System.out.print("Enter any two numbers: ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Enter your choice: ");
		System.out.println("Enter your choice 1: ");
		System.out.println("Enter your choice 2: ");
		System.out.println("Enter your choice 3: ");
		System.out.println("Enter your choice 4: ");
		System.out.println("Enter your choice 5: ");
		ch=s.nextInt();                                  //ch here is switch case variable
		switch(ch)
		{
		case 1:c=a+b;
		System.out.print("Additon "+c);
		     break;
		case 2:c=a-b;
		System.out.print("Substraction "+c);
		     break;
		case 3:c=a*b;
		System.out.print("Multiplication "+c);
		     break;
		case 4:c=a/b;
		System.out.print("Division "+c);
		     break;
		case 5:c=a%b;
		System.out.print("Remainder "+c);
		     break;
		default:
		System.out.print("Invalid choice....");
		     break;
		}
		     
		
		
	}
	
	

}
