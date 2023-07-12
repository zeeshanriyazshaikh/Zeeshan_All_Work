


class ThisKeyword2
{
int a=50;                                  //instance variable :- as written under class body but outside method body,instance cannot used without creation of object.

 
ThisKeyword2(int a)   // paramaterized constructor with...    //local variable;- written under any method.
{
	this.a=a;                           //this keyword used to distinguish between instance and local variable as it refers to instance variable.
}

void show()
{
	System.out.println(a);
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword2 r=new ThisKeyword2(5);           //5 value gets input in first local variable a then instance variable a with help of this keyword,while when we have not used..
r.show();                                                  //...this keyword output was 0 that is of instance variable default value as compiler was confused.
	}

}

