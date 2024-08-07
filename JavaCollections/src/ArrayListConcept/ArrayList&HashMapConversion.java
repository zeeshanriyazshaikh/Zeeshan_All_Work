import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
//CONVERSION OF HASHMAP TO ARRAYLIST
       HashMap<Integer, String> map = new HashMap<>();
map.put(1, "One");
map.put(2, "Two");
map.put(3, "Three");
System.out.print(map);
ArrayList<String> valuesList = new ArrayList<>(map.values());   //just values
ArrayList<Integer> keysList = new ArrayList<>(map.keySet());    // just keys
ArrayList<Map.Entry<Integer, String>> entriesList = new ArrayList<>(map.entrySet());
System.out.print(entriesList);                                  //both keys and values
       System.out.print(valuesList);
       System.out.print(keysList);


      // Converting ArrayList to HashMap
        HashMap<Integer, String> newMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : entriesList) {
            newMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("New Map: " + newMap);
    }
}
/* //SCENARIO 2: [ Converting ArrayList to HashMap ]
ArrayList<Object> list = new ArrayList<>();            //In Java, Object is the root class of all classes. 
        list.add(1); // Key                            //When you store an Integer or String in an Object reference, you are using upcasting
        list.add("One"); // Value
        list.add(2); // Key
        list.add("Two"); // Value

        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < list.size(); i += 2) {
            Integer key = (Integer) list.get(i);          //Integer and String are classes that extend the Object
            String value = (String) list.get(i + 1);      //When you retrieve an element from the ArrayList<Object>, it is returned as an Object. To use it as an Integer or String, you need to downcast it back to its original type.
            map.put(key, value);
        }

        System.out.println(map); // Output: {1=One, 2=Two}
*/
