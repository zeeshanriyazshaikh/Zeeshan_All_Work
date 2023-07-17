
public class DifferenceBetweenlengthVarandMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// size() SHOWS SIZE OF OBJECTS USED IN COLLECTIONS
		
String str="zeeshan shaikh"; 
int a=str.length();   //JAVA LENGTH METHOD length() TELLS YOU HOW MANY CHARCTERS OR OCCURANCE A TEXT STRING CONTAINS 
System.out.println(a);

int b[] = {1,2,3,4,5,6,7,8,9}; //INDEX VALUE IS 0 TO 8
int c=b.length;          // LENGTH VARIABLE DESCRIBES THE SIZE OF AN ARRAY
System.out.println(c);

		/*CHAT GPT INFO OF LENGTH(),LENGTH AND SIZE()
		In Java, the difference between the length method, length variable, and size is as follows:

Length Method:
In Java, the length() method is used specifically with strings to get the number of characters in the string. 
It's not a method of the String class, but rather a method of an instance of a String object.
This method returns an int representing the number of characters in the string.*/

String myString = "Hello, Java!";
int lengthOfString = myString.length();
System.out.println(lengthOfString); // Output: 12

/*		Length Variable:
In Java, arrays have a built-in property called length. It is not a method, but rather an attribute of the array object,
and it provides the number of elements in the array. Unlike the length method, the length variable does not require parentheses.*/
int[] myArray = {1, 2, 3, 4, 5};
int lengthOfArray = myArray.length;
System.out.println(lengthOfArray); // Output: 5
/*Size Method (for Collections):
The size() method is used with collections in Java to get the number of elements in the collection. Unlike arrays, 
collections (e.g., ArrayList, LinkedList, HashSet, etc.) are objects, and they don't have a length property.
Instead, they have a size() method to determine the number of elements in the collection.*/
	ArrayList<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        int sizeOfList = myList.size();
        System.out.println(sizeOfList); // Output: 3

	}

}
