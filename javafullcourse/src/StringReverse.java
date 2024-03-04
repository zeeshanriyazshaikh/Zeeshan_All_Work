
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="zeeshan shaikh";
		
		int length =str.length();
		
		for(int i=length-1;i>=0;i--) {
			
			char rev =str.charAt(i);
			System.out.print(rev);
/*
public class MyClass {
    String rev="";
    public void isPalindrome(String s){
        for(int i=0;i<s.length();i++){
            rev=s.charAt(i)+rev;
            System.out.println(rev);
        }
          System.out.println(rev);
        if(s.equals(rev)){
            System.out.print("it is palindrome");
        }
        else{
             System.out.print("it is not palindrome");
        }
    }
    public static void main(String args[]) {
        String str="zeez";
        MyClass c=new MyClass();
        c.isPalindrome(str);
    }
}
*/


/* #Reverse-Palindrome-String[convert char to string]
       String str = "MADAM";
        int strLen = str.length();
        for (int i = strLen - 1; i >= 0; i--) {
            char str1 = str.charAt(i);
            String str2 = String.valueOf(str1);
            System.out.print(str2);
        }
      
        */
			
		}
	}

}
