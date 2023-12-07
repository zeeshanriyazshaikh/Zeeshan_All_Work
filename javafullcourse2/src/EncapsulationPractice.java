

import java.util.Scanner;



class Baank
{
	private double bal=5000;  //properties of bank that they keep balance,password etc.
	private int pwd;
	private int a;
	
	public void Deposite()   //Behavior of bank
	{
		System.out.println("Enter the password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			System.out.println("Enter depositing value");
			Scanner ref=new Scanner(System.in);
			a=ref.nextInt();
			System.out.println(bal+a); 
		}
		else
		{
			System.out.println("mudda pagal hai : ");
		}
	}
		public void withdraw(double money)
		{
			System.out.println("Enter the password");
			Scanner s=new Scanner(System.in);
			pwd=s.nextInt();
			
			
			if(pwd==123)
			{
				System.out.println("Enter Withdrawing value");
				Scanner ref1=new Scanner(System.in);
				a=ref1.nextInt();
				System.out.println(bal-a); 
			}
			else
			{
				System.out.println("mudda pagal hai: ");
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
						System.out.println("mudda pagal hai ");
					}
				}
}
			
			
	public class EncapsulationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Baank b=new Baank();



System.out.println("1. Deposite : ");
System.out.println("2. Withdraw : ");
System.out.println("3. check balance: ");
System.out.println("\nEnter your choice: ");

int ch;
Scanner s2=new Scanner(System.in);
ch=s2.nextInt();

switch(ch)
{

case 1: b.Deposite();

break;
case 2: b.withdraw(1000);
break;
case 3: b.checkBal();
break;	
	default: System.out.print("Incorrect choice: ");
}

	}
}
}
-----------*-----------*--------------------------------------*-----------*-----------------------------
//EXAMPLE 2
	class A{
  private int value;
public void setValue(int x){
  value = x;
}
  public int getValue(){
    return value;
}
}
class B{
  public static void main(String[] args){
  A r = new A();
    r.setValue(100);
    System.out.println(r.getValue());
  }

}
