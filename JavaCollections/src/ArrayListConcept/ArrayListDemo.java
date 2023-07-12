package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;



public class ArrayListDemo {

	public static void main(String[] args) {
	
//Array is an object and its fixed
//static
		
		int i[] = new int[4];  //integer array,can only store max 4 values,array divided into 4 equal parts,index 0 to 3,cant go below zero and cant go above 3
		i[0]=100;    //storing 100 on zero index
		System.out.println(i[0]);
		System.out.println(i[3]); //as nothing stored on index 3 default output will be zero
		//System.out.println(i[4]); //as no index ,we will get array "OUT OF BOUND EXCEPTION" ,as size is fixed 0 to 3 i.e 4
		//System.out.println(i[-1]);//same as above error,-ve indexing not allowed in java like in python
		
		//ArrayList is default class in java
				//behaves as dynamic array,as whenever entries added index size increases
		//maintains the order
		//virtual capacity by default is 10 and physical capacity is 0,we can debug and check,ArrayList<Object>(20)-->this will increase virtual capacity 0 to 19
		//3 ways to define Array list
		//1>default generics
		ArrayList<Object> al=new ArrayList<Object>(); //this is raw type as we can store any type of data,<Object> (object type of data)means generic, array list should be parameterised not raw 
		al.add(100);
		al.add("zeeshan");
		al.add(10.10);
		al.add(true);
		System.out.println(al);
		System.out.println(al.get(3)); //to get specific index value
		System.out.println(al.size());
		
		//specific type of data if we need to store than can use wrapper class
		ArrayList<Integer> ai=new ArrayList<Integer>(); //only now we can add integers values, as we have now Integer generics in array list
		ai.add(10);
		System.out.println(ai.get(0));
		
		//iterating value from array list
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("zee"); //index 0
		str.add("wee"); //1
		str.add("tee"); //2
		str.add("bee"); //3
		System.out.println(str);
		System.out.println("-----------");
		
		//Typical for loop
		for(int s=0;s<str.size();s++) {
			System.out.println(str.get(s));
		}
		System.out.println("-----------");
		
		//for each loop
		for(String st:str)
		{
			System.out.println(st);
		}
		System.out.println("-----------");
		//Iterator,as it is interface of collections we can use it on arraylist to iterate as array list is also an collections part
		
		Iterator<String> it =str.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-----------");
		//one more way list into a list or list with other collection
		ArrayList<String> str1 = new ArrayList<String>(Arrays.asList("zee","wee","kee","bee"));
		System.out.println(str1);
		//for loop for above
		for(int m=0;m<str1.size();m++)
		{
			System.out.println(str1.get(m));
		}
	}

}
