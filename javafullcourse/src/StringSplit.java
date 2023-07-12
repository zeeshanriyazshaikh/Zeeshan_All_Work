

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "today is monday";   //PROGRAM TO WRITE FIRST LETTER OF STRING 
		String[] words=str.split(" ");
		
		for(int i=0;i<words.length;i++) {//to iterate values from where split method is used for loop is used
			char s=words[i].charAt(0);
			System.out.println(s);
		}
		
		
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
		


