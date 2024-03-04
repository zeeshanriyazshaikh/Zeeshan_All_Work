
public class MissingNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] a= {1,2,3,4,6}; //5 is missing

int n=a.length+1; //5+1=6

int sum=(n*(n+1))/2; //21 [this formulae takes some of above array ex:1+2+3+4+5+6=21]

for(int i=0;i<a.length;i++) {
	
	sum=sum-a[i];
}

System.out.println(sum);

	}

}
/* 
int[] a={1,2,3,4,6};
        int sum1 = 0;
        for(int i=0;i<a.length;i++)
        {
            sum1=sum1+a[i];
        }
        System.out.println(sum1);
        int sum2 = 0;
        for(int i=1;i<=6;i++)
        {
            sum2=sum2+i;
        }
        System.out.println(sum2);

        System.out.println("missing number is "+ (sum2-sum1));
*/
/*
public class MyClass {
    public static void main(String args[]) {
        int[] arr={1,2,3,4,6,7};
        int sum1=0;
        int sum2=0;
        for(int i=1; i<=7; i++){
            sum1+=i;
        }
        for(int j : arr){
            sum2+=j;
        }
        System.out.println(sum1-sum2);
}
}
*/
