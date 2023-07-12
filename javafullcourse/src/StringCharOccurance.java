
public class StringCharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="my name is zeeshan";
		int totallength=str.length();
		
	
		
		int lengthwithoutcharA=str.replace("a", "").length();
		
		int count=totallength-lengthwithoutcharA;
		System.out.println(count+" is count of char a");
		
	}

}
