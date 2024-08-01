public class MoveZerosToFront {
    public static void main(String[] args) {
        int[] array = {0, 8, 0, 3, 3, 0, 0, 5, 6, 7};
        int n = array.length;

        // Create a new array to store the result
        int[] result = new int[n];
        int j = n - 1; // Pointer for the result array, starting from the end

        // Traverse the original array from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (array[i] != 0) {
                result[j] = array[i];
                j--;
            }
        }

        // Fill the remaining elements with zeros
        while (j >= 0) {
            result[j] = 0;
            j--;
        }

        // Print the result
        for (int num : result) {
            System.out.print(num);
        }
    }
}
