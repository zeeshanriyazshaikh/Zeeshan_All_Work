
 abstract class animal
{
	animal()
	{
		
	}
	void legs()
	{
		System.out.println("animal has 4 legs");
	}
	abstract void sound();           // can't show essential details as here class is animal we can't tell about particular animal here so written abstract to hide. 
	abstract void eatings();
}
class dog extends animal
{
	//default super class is called when written d.legs();
	void sound()
	{
		System.out.println("bow bow");
	}
	void eatings()
	{
		System.out.println("biscuit");
	}
}






public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
dog d=new dog();
d.legs();
d.sound();
d.eatings();
	}

}
