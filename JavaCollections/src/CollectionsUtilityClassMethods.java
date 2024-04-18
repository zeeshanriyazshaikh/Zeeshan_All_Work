import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class CollectionsUtilityClassMethods {
    public static void main(String[] args) {
      //1. Sorting
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        System.out.println("Before sorting: " + numbers);
        Collections.sort(numbers);
        System.out.println("After sorting: " + numbers);
      
      //2. Reversing
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        System.out.println("Before reversing: " + names);
        Collections.reverse(names);
        System.out.println("After reversing: " + names);
      
      //3. Shuffling
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Before shuffling: " + numbers);
        Collections.shuffle(numbers);
        System.out.println("After shuffling: " + numbers);
      
      //4. Searching
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
        int index = Collections.binarySearch(numbers, 5);
        System.out.println("Index of 5: " + index);
      
      //5. Max/Min
        List<Integer> numbers = Arrays.asList(2, 8, 4, 6, 10);
        Integer max = Collections.max(numbers);
        Integer min = Collections.min(numbers);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
      
      //6. Frequency
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 2, 5);
        int frequency = Collections.frequency(numbers, 2);
        System.out.println("Frequency of 2: " + frequency);
      
      //7. Copy and fill
        List<Integer> source = Arrays.asList(1, 2, 3);
        List<Integer> destination = Arrays.asList(0, 0, 0, 0, 0);
        
        // Copy
        Collections.copy(destination, source);
        System.out.println("Copied list: " + destination);
        
        // Fill
        Collections.fill(destination, 10);
        System.out.println("Filled list: " + destination);
      
      //8. unmodifiableList
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        
        // Create unmodifiable list
        List<String> unmodifiableNames = Collections.unmodifiableList(names);
        
        // Try to modify unmodifiable list
        try {
            unmodifiableNames.add("David"); // This will throw UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify unmodifiable list");
        }
    }
}
