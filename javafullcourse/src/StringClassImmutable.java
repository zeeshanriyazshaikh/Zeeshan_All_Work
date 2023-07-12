
public class StringClassImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="ANKUSH";                                      //.....immutable(cannot be changed)
		    String str2=str.concat(" MADAM");                     //str2 is copy made to replace ankush to ankush kumar and concatenating is to add string to end of previous string
		    //System.out.println(str2); 
		    String str3=str2.concat(" IS WOMEN");
		    System.out.println(str3);
		                                                          // String str4=str.concat(str2).concat(str3);
		                                                          //System.out.println(str4);
		    
		    
		    
		    
		    
		    /* //TO REVERSE STRING CHARACTER USING StringBuffer class object.
		    
		    StringBuffer sb = new StringBuffer(str);   //reverse characters
		    System.out.println
		    (sb.reverse());
		    
		     */
		    
		    //STRING REVERSE PROGRAM
		    for(int i=str.length()-1;i>=0;i--) {
		    	char a=str.charAt(i);
		    	System.out.print(a);
		    }
		    
		    
		    
		    
	}

}
