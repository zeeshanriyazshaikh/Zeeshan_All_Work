	
public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int n=7;
		int t=0;
		
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				t=t+1; //come out of loop if this is not satisfied
				
			}
		}
		if(t==0)
		{
			System.out.println( n +" no is prime");
		}
		else
		{
			System.out.println( n + " no is not prime");
		}

/*
public class PrimeNumber {

    public static void main(String[] args) {
        for (int n = 50; n <= 100; n++) {
            int t = 0;

            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    t = t + 1; // come out of loop if this is not satisfied
                    break;     // optimize by breaking out of the loop as soon as a divisor is found
                }
            }

            if (t == 0) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }
        }
    }
}

*/
		
		
		
		
		
		
		
		
		
	}

}
