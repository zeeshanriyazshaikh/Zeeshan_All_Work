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
a)sort
int[] numbers = {5, 2, 8, 1, 6};
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 5, 6, 8]
b)binarySearch
int[] numbers = {1, 2, 3, 4, 5};
int index = Arrays.binarySearch(numbers, 3);
System.out.println("Index of 3: " + index); // Output: Index of 3: 2
c)equals
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
boolean isEqual = Arrays.equals(arr1, arr2);
System.out.println("Arrays are equal: " + isEqual); // Output: Arrays are equal: true
d)asList
String[] names = {"Alice", "Bob", "Charlie"};
List<String> nameList = Arrays.asList(names);
System.out.println(nameList); // Output: [Alice, Bob, Charlie]
e)fill
int[] numbers = new int[5];
Arrays.fill(numbers, 10);
System.out.println(Arrays.toString(numbers)); // Output: [10, 10, 10, 10, 10]
f)copyOf
int[] numbers = {1, 2, 3, 4, 5};
int[] copy = Arrays.copyOf(numbers, 3);
System.out.println(Arrays.toString(copy)); // Output: [1, 2, 3]
g)copyOfRange
int[] numbers = {1, 2, 3, 4, 5};
int[] copy = Arrays.copyOfRange(numbers, 1, 4);
System.out.println(Arrays.toString(copy)); // Output: [2, 3, 4]
h)toString
int[] numbers = {1, 2, 3, 4, 5};
String str = Arrays.toString(numbers);
System.out.println(str); // Output: [1, 2, 3, 4, 5]
i)mismatch
int[] arr1 = {1, 2, 3, 4, 5};
int[] arr2 = {1, 2, 6, 4, 5};
int mismatchIndex = Arrays.mismatch(arr1, arr2);
System.out.println("Mismatch index: " + mismatchIndex); // Output: Mismatch index: 2
j)min/max
int[] numbers = {5, 2, 8, 1, 6};
int minValue = Arrays.min(numbers);
int maxValue = Arrays.max(numbers);
System.out.println("Minimum value: " + minValue); // Output: Minimum value: 1
System.out.println("Maximum value: " + maxValue); // Output: Maximum value: 8
