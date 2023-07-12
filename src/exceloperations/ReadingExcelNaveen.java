package exceloperations;

import Testng.Xls_Reader;

public class ReadingExcelNaveen {
	static Xls_Reader reader;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reader = new Xls_Reader("C:\\Users\\Faiz Riyaz\\eclipse-workspace\\1Selenium\\EbayRegisterTestData.xlsx");
		
		//PRACTICE UTILITY FROM XLS_READER
		
		String cell=reader.getCellData("RegTestData", 0, 2);//    (sheet name, column number, row number) ,column no always starts with 0 and row with 1(that is entire column names only),from 2 actual row data content starts.
		System.out.println("First Cell Data: "+cell);
		int rowCount = reader.getRowCount("RegTestData");
		System.out.println("Total Row count: "+ rowCount);
		int columnCount = reader.getColumnCount("RegTestData");
		System.out.println("Total Column count:" +columnCount);
		
		//reader.addColumn("RegTestData", "Status");  //commenting as while running they get added repeatedly
		//reader.addSheet("Zeeshan");
		
		reader.setCellData("RegTestData", "Status", 2, "pass");
		String contact = reader.getCellData("Zeeshan", 0, 2);  //string ,numeric,boolean handled by naveen in utility ,for true write 'true in excel 
		System.out.println("contact column detail:" +contact); //output = contact column detail:8.097570308E9 //to avoid this always write '8097570308 in excel sheet data when numeric used
	
		String age = reader.getCellData("Zeeshan", 1, 2); 
		System.out.println("Age column detail:" +age);         //output = Age column detail:28.0               //to avoid this always write '28
		reader.addColumn("RegTestData", "status");
		for(int r=2;r <=rowCount; r++ )
		{
				String firstName = reader.getCellData("RegTestData", 0, r);
			System.out.print(firstName+" | " );
			String lastName = reader.getCellData("RegTestData", 1, r);
			System.out.print(lastName+" | " );
			String Email = reader.getCellData("RegTestData", 2, r);
			System.out.print(Email+" | " );
			String Password = reader.getCellData("RegTestData", 3, r);
			System.out.print(Password+" | " );
			System.out.println();
			reader.setCellData("RegTestData", "status", r, "pass");
			
		}		
	}

}
