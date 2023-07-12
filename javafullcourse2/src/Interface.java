interface Abc
{
	String Name="TVS";              // by default variable in interface is public + static + final
	int Speed=100;                  // by default variable in interface is public + static + final
	

	void start();                      //public+abstract
	void stop();                       //public+abstract
	
	default void color()             //default and static methods can be created inside interface 
	{
		System.out.println("color is red");
	}
	static void model()
	{
		System.out.println(" model is new");     //we can execute without creating an object just write vehicle.model thats it
	}
}
class Bad implements Abc
{

//@Override                           //it is annotation that says we are Overriding start and stop methods.
public void start()
{
	System.out.println("start(): insert key and press start ");
}
//@Override 
public void stop()
{
System.out.println("stop(): exit key");
}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abc obj=new Bad();
obj.start();
obj.stop();
Abc.model();
obj.color();
	}

}
