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
