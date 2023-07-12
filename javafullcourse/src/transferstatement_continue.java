import java.util.Scanner;

public class transferstatement_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter any number: ");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		
for(int i=1;i<=10;++i)
{
	if(i==5)
		continue;                 //it will skip count reaches 5 and continue
	System.out.print(i+"");
	
}
	}

}
