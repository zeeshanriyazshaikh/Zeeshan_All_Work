public class MoveZerosToFront {
    public static void main(String[] args) {
       int[] array = {0, 8, 0, 3, 3, 0, 0, 5, 6, 7};
        int n = array.length;

        List<Integer> zero = new ArrayList<>();
        List<Integer> nonzero = new ArrayList<>();

        // Separate zeros and non-zeros
        for (int z : array) {
            if (z == 0) {
                zero.add(z);
            } else {
                nonzero.add(z);
            }
        }

        System.out.println("Zeros: " + zero);
        System.out.println("Non-zeros: " + nonzero);

        // Merge back: zeros first
        int index = 0;
        for (int z : zero) {
            array[index++] = z;
        }
        for (int nz : nonzero) {
            array[index++] = nz;
        }

        // Final output
        System.out.println("Reordered array:");
        for (int val : array) {
            System.out.print(val + " ");
        }
    }
}
