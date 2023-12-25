package HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//key value pairs
//maintains no order
		//unique key
		//synchronised
		//it does not allow any null key and null values
		//initial capacity of HT=11,load factor LF=0.75
		//hashtable is synchronised ,thread safe
		//in HT no null key value allowed but in HM 1 null key and n number of null values are allowed
		
		
		Hashtable<String, String> sirname = new Hashtable<String, String>();        //HashTable<Integer, String>can also be used
		sirname.put("zeeshan", "shaikh:7861"); //zeeshan is key and shaikh is pair
		sirname.put("khansa", "baig");
		sirname.put("khansa", "shaikh"); //as HashTable does not contain duplicate key value shaikh overrides baig
		sirname.put("naseem", "shaikh");
		//sirname.put(null, "baig"); or sirname.put("baig",null);//IT WILL GIVE NULL POINTER EXCEPTION
		System.out.println(sirname.get("zeeshan"));  //write key to get value in ouput
		System.out.println(sirname);
		System.out.println(sirname.get("khansa"));
		System.out.println(sirname.get("faiz"));   //gives null output as no key of faiz name is there in hash map
		
		for(Entry m : sirname.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
