
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
		//STRING MANIPULATION
        String str = "Zeeshan has 4 years of experience";
        String str1 = "Zeeshan has 4 years of experience";
        String str2 = "Zeeshan HAS 4 years of experience";

        System.out.println(str.length()); //--O/P "33"
        System.out.println(str.charAt(3)); //--O/P "s"
        System.out.println(str.indexOf("s")); //--O/P "3"  [1st occurence of "s"]
        System.out.println(str.indexOf("s", 9)); //--O/P "10" [2nd occurence of "s"]
        int secondOccurence = str.indexOf("s", str.indexOf("s") + 1); //--O/P "10"  [2nd occurence of "s" but without hard code value]
        System.out.println(secondOccurence);
        System.out.println(str.indexOf("s", secondOccurence + 1)); //--O/P "18"  [3rd occurence of "s"]
        System.out.println(str.indexOf("has")); //--O/P "8" [Occurence of string]
        System.out.println(str.indexOf("Hello")); //--O/P "-1" [unavailable string]
        System.out.println(str.equals(str1));//--O/P "true" [2 string comparison ]
        System.out.println(str.equalsIgnoreCase(str1));//--O/P "true" [2 string comparison with ignore case]
        
        //COMPILER START COMPILING FROM LEFT TO RIGHT
        String x = "Hello";
        String y = "World";
        int a = 100;
        int b = 200;
        System.out.println(x+y); //O/P--"HelloWorld"
        System.out.println(a+b); //O/P--"300"
        System.out.println(x+y+a+b); //O/P--"HelloWorld100200"
        System.out.println(a+b+x+y); //O/P--"300HelloWorld"
        System.out.println(x+y+(a+b)); //O/P--"HelloWorld300"
	}

}

