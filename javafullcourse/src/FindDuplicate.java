

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,20,40,40,50}; //INTEGER ARRAY
		System.out.println("count of integer array is "+a.length);

for(int i=0;i<a.length;i++) { //Difference between length() method and length (variable) is length() method gives count of each char of string and length gives count of array and both have return type as int.
	
	for(int j=i+1;j<a.length;j++) {
		
		if(a[i]==a[j] && (i!=j)) {
			
			System.out.println("Duplicate integer value "+a[j]);
			
		}
	}
}

String b[]= {"a","b","b","ab"}; //STRING ARRAY

System.out.println("size of string array is "+b.length);

for(int i=0;i<b.length;i++) {

for(int j=i+1;j<b.length;j++) {

if(b[i]==b[j] && (i!=j)) {
	
	System.out.println("Duplicate string value "+b[j]);
	
}
}
}
	}

}
