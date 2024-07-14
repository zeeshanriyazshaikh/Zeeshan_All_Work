
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
#REVERSE STRING
		
		String str="zeeshan shaikh";
		
		int length =str.length();
		
		for(int i=length-1;i>=0;i--) {
			
			char rev =str.charAt(i);
			System.out.print(rev);

/*
#REVERSE STRING USING EMPTY STRING

public class MyClass {
public static void main(String args[]) {
    String rev="";
    String str="zeez";
    
        for(int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;   //we add rev to char and store in rev which is string hence no need to convert char to string here
            System.out.println(rev);
        }

        if(str.equals(rev)){
            System.out.print("it is palindrome");
        }
        else{
             System.out.print("it is not palindrome");
        }
    
    }
}
*/


/* #REVERSE PALLINDROME STRING ---> [convert char to string]
       String str = "MADAM";
       int strLen = str.length();

        for (int i = strLen - 1; i >= 0; i--) {
            char str1 = str.charAt(i);
            String str2 = String.valueOf(str1);   //char to string
            System.out.print(str2);
        }
      
        */
			

