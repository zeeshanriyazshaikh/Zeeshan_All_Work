import java.util.ArrayList;

public class JavaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> Name=new ArrayList<String>();    //this is prdefined class Arraylist in java collection so we don't need to write code just create object and use it
	                                                      //now we have created array object now we just need to insert element
		Name.add("zeeshan");                                      // add is pre defined method of array list class through which we can insert elements
		Name.add("khansa");
		Name.add("faiz");
	
	System.out.println(Name);
	Name.add("Anees");
	System.out.println(Name);
	Name.add(1, "Naseem");                            // adding Naseem name on 2nd position number or 1 index as zeeshan starts from 0 index
	System.out.println(Name);
	Name.remove(1);                                   // removing Naseem name from array
	System.out.println(Name);
	Name.set(0, "khansa");                            // moving khansa to first position
	System.out.println(Name);                             //System.out.print(Name.get(2); will print only faiz in next array
	                                                   // Name.clear(); will delete all
	Name.add(1,"zeeshan");
	System.out.println(Name);
	Name.remove(1);
	System.out.println(Name);
	System.out.print(Name.get(3)); 
	//similar is linked list
	// for LIFO stack is used and push means add and pop is to remove
	// for FIFO Array Dequeue is used
	}
}

