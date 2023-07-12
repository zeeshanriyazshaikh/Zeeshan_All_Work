import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.print("Enter any three numbers: ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		int r=(a>b)?(a>c?a:c):(b>c?b:c); //a>b is true then it will check a>c if yes then a will print else : c will print ,if but a is not greator than b then it will check b>c is yes b will printed and if not : c will printed
		{
		System.out.print("greator number is "+r);
		
		}
	}

}
