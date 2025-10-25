
public class MissingNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
#FIND MISSING NUMBER IN ARRAY
		
int[] a= {1,2,3,4,6}; //5 is missing

int n=a.length+1; //5+1=6

int sum=(n*(n+1))/2; //21 [this formulae takes some of above array ex:1+2+3+4+5+6=21]

for(int i=0;i<a.length;i++) {
	
	sum=sum-a[i];
}

System.out.println(sum);

	}

}
/* 
# ALTERNATE METHOD TO FIND MISSING NUMBER
int[] a={1,2,3,4,6};
        int sum1 = 0;
        for(int i=0;i<a.length;i++)
        {
            sum1=sum1+a[i];
        }
        System.out.println(sum1);
        int sum2 = 0;
		Arrays.sort(a);
        for(int i=1;a[a.length-1];i++)
        {
            sum2=sum2+i;
        }
        System.out.println(sum2);

        System.out.println("missing number is "+ (sum2-sum1));
*/
/*
#FIND MISSING NUMBER SAME AS ABOVE BUT USING FOR-EACH LOOP
public class MyClass {
    public static void main(String args[]) {
        int[] arr={1,2,3,4,6,7};
        int sum1=0;
        int sum2=0;
        for(int i=1; i<=7; i++){
            sum1+=i;
        }
        for(int j : arr){
            sum2+=j;
        }
        System.out.println(sum1-sum2);
}
}
*/

# LIST OF ALL MISSING NUMBERS

import java.util.*;

public class listOfMissingNumbers {
   public static void main(String[] args) {
       int[] nums = {10, 1, 5, 4, 6}; // Example array

       Set<Integer> set = new HashSet<>();
       List<Integer> missing = new ArrayList<>();

       int max = nums[nums.length-1];
System.out.println("Max " + max);
       for (int num : nums) {
           set.add(num);
       }
System.out.println("Set " + set);
       for (int i = 1; i <= max; i++) {
           if (!set.contains(i)) {
               missing.add(i);
           }
       }

       System.out.println("Missing numbers: " + missing);
   }
} 
/*

