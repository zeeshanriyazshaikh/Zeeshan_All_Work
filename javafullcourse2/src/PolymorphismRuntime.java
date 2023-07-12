                                                                     // METHOD OVERRIDING //
class shape
{
	void draw()
	{
		System.out.println("can't say shape type");
	}
}
class square extends shape
{
	@Override               //it is used when using same method name in super and sub class,Override here O should always be capital.
	void draw()              //Override written means output we will get is of sub class and if not written Override and method name is diff then it will call superclass onlyyy.
	{
		
		super.draw();                                            //if we write here super.draw();  then it will call superclass including subclass, then o/p we will get of both class.
		System.out.println("square shape");
		super.draw();                         //             ....if we write this we can get super class output as well
	}
}



public class PolymorphismRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape r;                                     //we can write this also
/*shape r=new square();                          //shape here is we are taking reference of superclass and making object of subclass i.e:  square.
r.draw();*/
		
	
r = new shape();
r.draw();
r = new square();
r.draw();

	}

}
