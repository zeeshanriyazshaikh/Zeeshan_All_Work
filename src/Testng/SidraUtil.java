package Testng;

import java.util.ArrayList;

public class SidraUtil {
static Xls_Reader reader;
	
	public static ArrayList<Object[]> sidraTestData()
	{
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {                                                                 //try and catch block so that if in future excel location not there and different excel is there it should not throw error
			reader = new Xls_Reader("C:\\Users\\Faiz Riyaz\\eclipse-workspace\\1Selenium\\EbayRegisterTestData.xlsx"); //excel sheet path
		} catch(Exception e) {
			e.printStackTrace();
		}
		for(int r=2;r<=reader.getRowCount("SidraTestData");r++)
		{
			String email=reader.getCellData("SidraTestData", "Email", r);
			String password=reader.getCellData("SidraTestData", "Password", r);
		Object[] ob = {email,password};
		myData.add(ob);
		}
		return myData;
		}
	}

