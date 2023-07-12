import java.io.File;
import java.io.IOException;

public class createFile {

public static void main(String[] args) throws IOException {//this is used to bybass exception similar like try and catch,now exception is handled by main method caller i.e: JVM
		// TODO Auto-generated method stub
File f=new File("C:\\Users\\Faiz Riyaz\\Desktop\\LC.txt");

if(f.createNewFile())
{
	System.out.println("file succesfully created");
}
else
{
	System.out.println("file already exist..!");	     //once created file then we try to execute then this msg will show up.
}
		
	}

}
