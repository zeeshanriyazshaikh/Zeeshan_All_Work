import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
System.out.print("Enter any two numbers:  ");
Scanner S=new Scanner(System.in);              //Scanner first witten is class of java util package,s is object reference,new is DMA,Scanner(System.in) is invoking the constructor of the Scanner class.  
a=S.nextInt();                                   //system is predefined class of java default lang package and in is to take input
b=S.nextInt();  //nexint is Scanner class methods to take input from user

c=a+b;
System.out.print("Sum of two numbers: "+c);
	}

}
