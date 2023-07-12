class C implements Runnable                              //class A implements 
{
	
	public void run()                                    // run is the only pre defined method in runnable interface
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("zeeshan");
			try {                                    // we cant use throws exception here as it can only used in Main
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ByImplementingRuntimeInterface {             //class B

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//Runnable r=new C();  we can also write like this also		
C r=new C();                                             //object created for child thread in class C
Thread t=new Thread(r);                                // making thread object as without it we cannot use t.start method as it is a method of thread class only and not runnable interface
t.start();                                                // pre defined method in thread class to start or call child thread

for(int i=1;i<=5;i++)
{
	System.out.println("khansa");
	Thread.sleep(1000);
}

	}

}
