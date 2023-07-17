
import java.util.Arrays;
import java.util.Scanner;

public class Aarray_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//                            ### 1D ARRAY PROGRAM ###
	                                               ///int a[]= {10,20,30,40,50};  ye ek tarika hai next continued...
	int a[]=new int[5];                              //array object
	System.out.print("Enter array element: ");       //shortcut to type s.o.p is type sout then press tab
	Scanner s=new Scanner(System.in);                    //object create
	for(int i=0;i<a.length;i++)                              //for loop ,array counter starts from 0 positions
	{
	a[i]=s.nextInt();
	}
	Arrays.sort(a);                                ///Arrays is class of util package that use sort to arrange in ascending order
	System.out.println("sorted array element: ");
	for(int b : a)                                  //for each loop a value gets store in b one by one// to iterate values from array object for each loop required
	{
		System.out.print(b+" ");                      //b result will show up
	}
		
	}
}
