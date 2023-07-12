import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int a[][]=new int[2][2];                             //2 column 2 rows
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the array elements" );
		for(int i=0;i<2;i++)                                // 0 and 1 as i<=2 not written   //nested for loop
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=s.nextInt();
				
			}
			
		}
	
		System.out.print("\nMatrix elements:\n" );
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
