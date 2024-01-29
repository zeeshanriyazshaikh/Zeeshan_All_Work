
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="zeeshan shaikh";
		
		int length =str.length();
		
		for(int i=length-1;i>=0;i--) {
			
			char rev =str.charAt(i);
			System.out.print(rev);

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
