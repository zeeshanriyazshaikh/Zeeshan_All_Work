 interface Ek
 {
	 void show();          //public + abstract
	 
 }
 interface Do
 {
	 void show();
	 
 }
 class Multiple implements Ek,Do
 {
	public void show()              //public should be written here
	 {
		 System.out.println("interface Ek and Do");
	 }
	 
 }
public class MultipleInheritance_using_Interface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multiple m=new Multiple();
m.show();

	}

}
