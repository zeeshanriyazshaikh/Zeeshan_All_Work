
public class StringCharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="my name is zeeshan";
		int totallength=str.length();
		
	
		
		int lengthwithoutcharA=str.replace("a", "").length();
		
		int count=totallength-lengthwithoutcharA;
		System.out.println(count+" is count of char a");

		/*Second way to count occurence
String str = "Zeeshan has 4 years of experience !!";
        int count = 0;
        for (char c: str.toCharArray()){
            if (Character.toLowerCase(c) == 'e'){
                count++;
            }

        }
        System.out.println("e count is as follows = " + count);
		*/
		
	}

}
