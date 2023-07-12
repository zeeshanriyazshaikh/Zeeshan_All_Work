 import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
System.out.println("Enter any number: ");
Scanner obj=new Scanner(System.in);
num=obj.nextInt();

for(int i=1;i<=10;i++)            //for(int initialization;condition;incr/dcr)
{
	System.out.println(num*i);      //number that user input gets multiply by incremented number
}

		
		
		
		
	}

}
