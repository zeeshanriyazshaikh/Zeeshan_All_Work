import java.util.ArrayList;

import exceloperations.Xls_Reader;

public class PracticeTestng2 {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> gettestdataexcel()
	{
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try {
			reader = new Xls_Reader("C:\\Users\\Faiz Riyaz\\eclipse-workspace\\1Selenium\\EbayRegisterTestData.xlsx");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		int rowcount=reader.getRowCount("RegTestData");
		
		
		for(int r=2;r<=rowcount;r++)
		{
			String firstname=reader.getCellData("RegTestdata", 0, rowcount);
			String lastname=reader.getCellData("RegTestdata", 1, rowcount);
			
			Object[] ob= {firstname,lastname};
			myData.add(ob);
		}
		return myData;
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
