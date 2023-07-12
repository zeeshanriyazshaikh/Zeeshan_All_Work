
public class MissingNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] a= {1,2,3,4,6}; //5 is missing

int n=a.length+1;

int sum=(n*(n+1))/2;

for(int i=0;i<a.length;i++) {
	
	sum=sum-a[i];
}

System.out.println(sum);

	}

}
