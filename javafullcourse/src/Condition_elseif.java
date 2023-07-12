import java.util.Scanner;

public class Condition_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks;
		
		System.out.print("Enter the percentage:- ");
		Scanner obj=new Scanner(System.in);
		marks=obj.nextInt();
		if(marks>=60 && marks<=100)        // in this we can put many else_if statements under if_else condition,&& is AND logical operator that means all condition has to be true than throw below statement
		{
			System.out.print("First class ");
		}
		else if(marks>=35 && marks<60)     //>= is relational operator means greator or equals to
		{
			System.out.print("Second class");
		}
		else if(marks<35)
		{
			System.out.print("Failed ");
		}
		else
		{
			System.out.print("Invalid input");
		}
		}
	}


