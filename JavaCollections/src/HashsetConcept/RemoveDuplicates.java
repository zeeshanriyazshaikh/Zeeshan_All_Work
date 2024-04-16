
package HashsetConcept;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//REMOVING DUPLICATES
		
ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(1,2,2,2,2,3,33,3,4,4,5));

LinkedHashSet<Integer> lhset=new LinkedHashSet<Integer>(al); //SET contains only different values

//ArrayList<Integer> removeduplicate=new ArrayList<Integer>(lhset);

System.out.println(lhset);
		
	//
HashSet<Integer> hs=new HashSet<Integer>();
hs.add(10);
hs.add(20);//un ordered o/p
hs.add(30);
hs.add(30);//store different elements
System.out.println(hs);

for(int i:hs)
{
	System.out.println(i);
}
	
	}

}
/*
#ALTERNATE METHOD [From program: list of missing numbers in array]
int a[] = {1,2,2};
       Set<Integer> set = new HashSet<Integer>();
       for(int b : a){
         set.add(b);  
       }
       System.out.println(set);
       
       //Iterate from set
       for(int sets:set){
           System.out.print(sets+" ");
       }
*/
