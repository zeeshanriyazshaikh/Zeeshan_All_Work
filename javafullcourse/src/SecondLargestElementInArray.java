import java.util.Arrays;
public class MyClass {
    public static void main(String args[]) {
     int a[] = {1,2,4,5,7,6,3};
     int length = a.length;
    Arrays.sort(a);
     System.out.print(Arrays.toString(a));
     int secondlargest = a[length-2]; // 7-2=5 and on index 5th int is 6
     System.out.println(" ");
     System.out.println("Second largest element in Array is " + secondlargest);
//Output = 6 
    }
}
