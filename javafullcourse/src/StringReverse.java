
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="zeeshan shaikh";
		
		int length =str.length();
		
		for(int i=length-1;i>=0;i--) {
			
			char rev =str.charAt(i);
			System.out.print(rev);
			
		}
	}

}
