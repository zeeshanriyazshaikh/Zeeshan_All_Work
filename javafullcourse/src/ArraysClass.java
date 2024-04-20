import java.util.Arrays;
import java.util.Scanner;

public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


int a[]= {10,20,30,40,50};      //a[5];  ,array index position starts from 0  ,[] is sub-script operator ,we can also write creating object like int a[]=new int [5]
System.out.println(a[4]);
System.out.println(a[2]);

int b[] = new int [5];
Scanner s = new Scanner(System.in);
System.out.println("enter 5 no' in array");
for(int i=0;i<=4;i++)
{
	b[i]=s.nextInt();
	
}

System.out.println();
Arrays.sort(b);           //Arrays: Utility class for working with arrays.Contains various methods for manipulating arrays(such assorting and searching).

System.out.println("sorted array element: ");
for(int c : b)                                  //for each loop a value gets store in b one by one
{
	System.out.print(c+" ");                      //b result will show up
}
	}

}
#ARRAYS THEORY:
1>Arrays: Utility class provides total 29 methods for working with arrays.
2>Contains various methods for manipulating arrays(such as sort,binarySearch,equals,asList,fill,copyOf,copyOfRange,toString,mismatch,min,max).
