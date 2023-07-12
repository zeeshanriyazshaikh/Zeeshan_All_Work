
public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str=new String("ANKUSH");                                  //without creating object:      String str="ANKUSH";

String str1="ANKUSH";                                // to return string length......int r=str.length();
                                                          //                              System.out.print(r);

                                                  //for capital  =  toUpperCase,  for small   =   toLowerCase


if(str==str1)                                     //explained in note book why str==str1 not equal.
{
	System.out.print("both are equal");     	  //to make but equal regardless then we can write if(str.equals(str1)) as it does not care about variale just saw object content ANKUSH is same then it will show result both are equal.
}
else
{
	System.out.print("both are not equal");     	
}
	}

}

