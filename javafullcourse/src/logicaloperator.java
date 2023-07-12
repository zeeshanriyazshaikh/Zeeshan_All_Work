
public class logicaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
		System.out.println(a==b && a!=b); //any one false result is false:AND operator
		System.out.println(a>b || a<b);   //any one condition true result is true:OR operator
		System.out.println(!(a>b));       //reverse the result:NOT operator

	}

}

