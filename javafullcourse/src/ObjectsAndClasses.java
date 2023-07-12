
public class ObjectsAndClasses {
int age=27+1;                                  //class Person start here till...
int weight=90;
double height=5.10;                          //age,height,weight,color here are properties or state of an class
String color="wheatish";                     //eat,walk here are behaviour of an class

void eat()
{
	System.out.println("i can eat");
}
void walk()
{
	System.out.println("i can walk");
}                                                            //till here ends
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectsAndClasses p=new ObjectsAndClasses();                             //P is an object created and ObjectsAndClasses
		System.out.println(p.age);                                              //object created to access defined state and behaviour.
		System.out.println(p.weight);
		System.out.println(p.height);
		System.out.println(p.color);
		
		p.eat();  p.walk();
	}

}
