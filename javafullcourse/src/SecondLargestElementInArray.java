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
/*
        int[] a = {5, 2, 8, 1, 6};
        int secondMax = 0;
        int max = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                secondMax=max;
                max=a[i];
            }
            else if (a[i] > secondMax && a[i] != max) {
                secondMax = a[i]; 
            }
        
        }
        System.out.println(secondMax);

*/

        
    }
}
