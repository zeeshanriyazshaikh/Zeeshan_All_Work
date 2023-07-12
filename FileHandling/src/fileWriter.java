import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

public static void main(String[] args) {  //here if we dont want to handle exception manually by try and catch then we can also use throws exception like used in previous program.
		// TODO Auto-generated method stub

		try
		{
			FileWriter f=new FileWriter("C:\\Users\\Faiz Riyaz\\Desktop\\LC2.txt");  //we can also use classes like 2nd class=BufferedWriter,3rd class=FileOutputStream,and PrintWwriter.  
			try        //any exception occurs during write operation this try-finally block will handle      //file writer is class in io package to write in file
			{          //we can execute by just one try catch block also but there is disadvantage that no compulsion that file will get close only, but finally block assures it
				f.write("java programming best language...!"); //f is object reference and write is method to write
			}
			finally       //data written or not written,what so ever file should be closed,connection should be disconnected
			{
				f.close();
				
			}
			System.out.println("successfully data wrote in file");
		}
		catch(IOException i)    //we can write any variable instead i
		{
			
		System.out.println(i); //any exception if occured i will show
		}
		
		
		
	}

}
