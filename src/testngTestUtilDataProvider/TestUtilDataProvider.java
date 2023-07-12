
package testngTestUtilDataProvider;

import java.util.ArrayList;
import com.excel.lib.util.Xls_Reader;

public class TestUtilDataProvider { //copy paste entire code from utility to read file.

	static Xls_Reader  reader;
	
	
	
public static ArrayList<Object[]> getDatafromExcel() {
	ArrayList<Object[]> myData = new ArrayList<Object[]>();
	try {                                                                 //try and catch block so that if in future excel location not there and different excel is there it should not throw error
		reader = new Xls_Reader("C:\\Users\\Faiz Riyaz\\eclipse-workspace\\1Selenium\\EbayRegisterTestData.xlsx"); //excel sheet path
	} catch(Exception e) {
		e.printStackTrace();
	}
	for(int rowNum =2;rowNum<=reader.getRowCount("RegTestData");rowNum++) {//rowNum 2 as row starts from 2 in excel,getRowCount gives total row count,
		String firstName = reader.getCellData("RegTestData", "firstname", rowNum);//getCellData from RegTestData Sheet ,first name is first column and as considering first row it it is first row first cell, 
	String lastName = reader.getCellData("RegTestData", "lastname", rowNum);//rowNum is for loop counter position.
	String Email = reader.getCellData("RegTestData", "email", rowNum);
	String Password = reader.getCellData("RegTestData", "password", rowNum);
	Object ob[] = {firstName,lastName,Email,Password}; //object array,in it we can store different types of values.
	myData.add(ob);
}
	return myData; //return array list,getDatafromExcel method returning myData and myData is what it is array list containing array object,thats why we have written ArrayList<Object[]> as return type of getDatafromExcel method as it is returning myData arrayList,
	
	
	
}
}
	
		
	
	
	


