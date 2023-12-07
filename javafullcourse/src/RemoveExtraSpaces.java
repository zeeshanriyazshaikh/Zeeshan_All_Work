
public class RemoveExtraSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="";
		
String str="   Welcome    to            s apient ? ";

String str1=str.replaceAll("\\s+"," ").trim(); //----Symbol \\s is for single white space and \\s+ is for one or multiple, trim removes leading and trailing space," "--it means 1 space,""--it means no space

System.out.println(str1);
String str2 = str1.replaceAll("s apient", "sapient");
System.out.println(str2);




//for(int i=0;i<str.length();i++)
//{
//	if((str.charAt(i)!=' ') && (str.charAt(i+1)!='\t')) 
//	{
//		s=s+str.charAt(i);
//	}
//	
//}
//System.out.print(s);


	}

}
