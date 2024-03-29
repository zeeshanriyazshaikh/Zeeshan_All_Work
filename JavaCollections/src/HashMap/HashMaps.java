package HashMap;
import java.util.HashMap;
import java.util.Map.Entry;
public class HarshMarps {

	public static void main(String[] args) {
		
                //HashMap class implements Map interface
		//HashMap does not guarantee or maintain order. LinkedHashMap should be used instead for ordering purpose
		//store values-->key-value pairs<k,v>
		//keys must be unique, but values can be duplicate.
		//it may have one null key and multiple null values
		//non synchronised,not thread safe,fast performance,more than one threads can access and process hashmap simultaneously.
		
		//disadvantage=concurrent modification exception-- fail - fast condition(multithreading concept thread 1 that is t1 remove key1 but t2 fetching key1 same time then we will get exception)
		//hashmap considered over hashtable if there is no use of multithreading concept
		//key-->object-->Hashcode-->value//key stored in form of object and object having hashcode where value gets stored//hash code(32 bit int) is something which every object has is unique identifier
		//initial capacity of HM=16(16 segments),LF=0.75
		
		HashMap<String, String> sirname = new HashMap<String, String>();        //HashMap<Integer, String>can also be used
		sirname.put("zeeshan", "shaikh:7861"); //zeeshan is key and shaikh is pair
		sirname.put("khansa", "baig");
		sirname.put("khansa", "shaikh"); //as hashmap does not contain duplicate key value shaikh overrides baig
		sirname.put("naseem", "shaikh");
		sirname.put("fazal", "baig");
		System.out.println(sirname.get("zeeshan"));  //write key to get value in ouput
		
		System.out.println(sirname.get("khansa"));
		System.out.println(sirname.get("faiz"));   //gives null output as no key of faiz name is there in hash map
		
		//TO ITERATE ALL ENTERIES OF HASHMAP
		
		for(Entry m : sirname.entrySet()) {// entrySet Returns a Set view of the mappings contained in this map//Map.Entry is a raw type. References to generic type Map.Entry<K,V> should be parameterized
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println(sirname);
		sirname.remove("khansa");
		System.out.println(sirname);
		
		
		
		
	}

}
