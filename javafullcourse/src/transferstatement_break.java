import java.util.Scanner;

public class transferstatement_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		System.out.println("Enter any number: ");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		
for(int i=1;i<=10;++i)
{
	if(i==5)
		break;                       //it will break loop once count reaches 5
	System.out.print(i+"");
	
}

	}

}
