import java.util.Scanner;

public class do_whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter any number: ");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		
do                                            //it print no matter what regardless of while loop
{
	System.out.print(num+" ");
num++;
}

while(num<=11);                               //loop repeated 11 times
	
}

}
