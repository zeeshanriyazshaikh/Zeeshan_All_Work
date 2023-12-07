

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "today is monday";   //PROGRAM TO WRITE FIRST LETTER OF STRING 
		String[] words=str.split(" ");
		
		for(int i=0;i<words.length;i++) {//to iterate values from where split method is used for loop is used
			char s=words[i].charAt(0);
			System.out.println(s);
		}
		/*String[] (String Array):
1>String[] is a data type used to represent an array (or list) of strings.
2>It can store multiple strings, organized as an array, where each element is a separate string.
3>Example: String[] names = {"today", "is", "monday"};
4>In summary, String is used for single strings, while String[] is used for arrays or collections of strings. */

		
		
		//PROGRAM TO SPLIT WORDS
		
		
		
		String str2= "hello,world,how,are,you";
			String[] parts=str2.split(",");  //spit by "," and split return type is String[]
			
			for(int i=0;i<parts.length;i++)
			{
				String b=parts[i];
				System.out.println(b);
			}
		}

	
	}
		


