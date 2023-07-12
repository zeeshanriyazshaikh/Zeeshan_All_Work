import java.util.Scanner;

class Bank
{
	private double bal=5000;
	private int pwd;
	
	public void Deposite(double money)
	{
		System.out.println("Enter the password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			bal=bal+money;
			System.out.println("Deposited Money: "+money);
			System.out.println("Total balance: "+bal);
			 
		}
		else
		{
			System.out.println("Incorrect password: ");
		}
	}
		public void withdraw(double money)
		{
			System.out.println("enter the password");
			Scanner s=new Scanner(System.in);
			pwd=s.nextInt();
			
			if(pwd==123)
			{
				bal=bal-money;
				System.out.println("withdrawn Money: "+money);
				System.out.println("Total balance: "+bal);
				 
			}
			else
			{
				System.out.println("Incorrect password: ");
			}
		}
				public void checkBal()
				{
					System.out.println("enter the password");
					Scanner s=new Scanner(System.in);
					pwd=s.nextInt();
					
					if(pwd==123)
					{
						
						System.out.println("Total balance: "+bal);
						}
					else
					{
						System.out.println("Incorrect password: ");
					}
				}
}
			
			
	public class EncapsulationCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank b=new Bank();

int ch;

System.out.println("1. Deposite : ");
System.out.println("2. Withdraw : ");
System.out.println("3. check balance: ");

System.out.println("Enter your choice: ");

Scanner s2=new Scanner(System.in);
ch=s2.nextInt();

switch(ch)
{

case 1: b.Deposite(1000);

break;
case 2: b.withdraw(1000);
break;
case 3: b.checkBal();
break;	
	default: System.out.print("Incorrect choice: ");
}

	}

}
