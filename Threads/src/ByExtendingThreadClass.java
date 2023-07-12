
class A extends Thread
{
	@Override                                            //pre available method in thread
	public void run()                                    // run is pre defined method in thread
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




public class ByExtendingThreadClass {                      // Class B

	public static void main(String[] args) throws InterruptedException {                //main thread called by JVM
		// TODO Auto-generated method stub
		
A t=new A();                                             //object created for child thread in class A
t.start();                                                // pre defined method in thread class to start or call child thread

for(int i=1;i<=5;i++)
{
	System.out.println("khansa");
	Thread.sleep(1000);
}

	}

}
