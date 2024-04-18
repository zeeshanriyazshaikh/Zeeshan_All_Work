import java.util.Map;
import java.util.*;
import java.util.HashMap;
class HelloWorld {
    public static void main(String[] args) {
      ArrayList<Integer> num = new ArrayList<>();    
		num.add(1);                                      
		num.add(2);
		num.add(3);
		System.out.println("Max Element = "+ Collections.max(num));
      
    }
}
#THEORY:

A]Collection
1>Root interface in the collection hierarchy.
2>It extends Iterable.
3>As it is a interface it contains default public and abstract method but after jdk 1.8 it contains static and default method also. 
4>List,Set,Queue etc.
	
B]Collections
1>It is a utility class in java which contains only static methods.
2>It extends Objects.
3>It has only static methods 
4>For example: sort(),reverse(),shuffle(),binarySearch(),max(),min(),frequency(),copy() and fill(),unmodifiableList().
