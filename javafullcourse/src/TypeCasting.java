

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//TYPE CASTING MEAN CONVERSION OF ONE DATA TYPE INTO ANOTHER
		//TWO TYPES IS IMPLICIT AND EXPLICIT
		//IMPLICIT MEANS LOWER TO HIGHER CONVERSION AND COMPILER AUTOMATICALLY DOES THIS
		//EXPLICIT IS HIGHER TO LOWER,WE HAVE TO DO,SOMETIMESS RESULT IN LOSS OF DATA
		
		int a=10;  //implicit 
		double b=a;
		System.out.println(b);
		
		double c=10.00;//explicit //example WebDriver driver
		
		int d=(int) c;            //        TakesScreenshot camera = (TakesScreenshot) driver;
		
		System.out.println(d);
		
		
		
	}

}
