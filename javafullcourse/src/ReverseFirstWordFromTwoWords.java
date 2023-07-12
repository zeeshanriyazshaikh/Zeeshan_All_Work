
public class ReverseFirstWordFromTwoWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String str="zeeshan shaikh"; //JUST REVERSE FIRST WORD ZEESHAN AND KEEP SHAIKH AS IT IS

		
		
		
		
		for(int i=6;i>=0;i--) {
			
			char c=str.charAt(i);
			System.out.print(c);
		
		}
		for(int j=7;j<str.length();j++) {
			char c=str.charAt(j);
			System.out.print(c);
		
		}
	}

}
