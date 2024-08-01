//USING 2 FOR LOOPS

public class RotateArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = a.length;
        
        if (n > 0) {
            // Store the first element of the array
            int firstElement = a[0];
            
            // Shift all elements to the left by one position
            for (int i = 1; i < n; i++) {
                a[i - 1] = a[i];
            }
            
            // Move the first element to the end
            a[n - 1] = firstElement;
        }

        // Print the modified array
        for (int i : a) {
            System.out.print(i);
        }
    }
}


//USING SINGLE FOR LOOP

public class ArrayShift {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = a.length;

        // Start from the second element and go to the end, then print the first element
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i % n]); // Use modulus to wrap around
        }
    }
}
