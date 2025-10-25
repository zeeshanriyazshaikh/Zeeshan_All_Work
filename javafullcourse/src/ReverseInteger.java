
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 1234;
		int b;
		
		while(a>0) {
			
			b=a%10;  //modulas o/p is remainder
			
			System.out.print(b);
			
			a=a/10;  //division o/p is quotient
		
		}



		
		//USING STRING-BUILDER
public class ReverseNumber {
    public static void main(String[] args) {
        int a = 1234;

        // Convert number to string and reverse it
        String reversed = new StringBuilder(String.valueOf(a)).reverse().toString();

        System.out.println(reversed); // Output: 4321
    }
}

	
		
	}

}

