import java.io.*;         //* is used to select all the classes of the package
import java.io.IOException;

public class fileReader {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		try
		{
		FileReader r=new FileReader("C:\\Users\\Faiz Riyaz\\Desktop\\LC.txt"); //others are we can also use is BufferedReader,FileInputStream,ScannerClass 
		try
		{
			int i;
			while((i=r.read()) != -1) //we can read data till i equals to -1 , //r.read is a method that read character by char,and  return in integer value,we can use r.readline to read entire line at a time
			{
				System.out.print((char)i);   //returning readable content in character forms converting from int//it is also called type casting
			}
		}
		finally
		{
			r.close();    //closing statement what it does is any exception occurs while reading also then too it will close the file
			System.out.println("\nfile closed");
		}	 
		}
		catch(IOException e)
		{
			System.out.println(e);
			
		}
		
		
	}

}
