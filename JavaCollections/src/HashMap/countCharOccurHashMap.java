import java.util.HashMap;
import java.util.Map;

public class CharOccurrence {
    public static void main(String[] args) {
        String str = "hello world 123";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Convert to lowercase for case-insensitive counting
                c = Character.toLowerCase(c);
                // If the character is already present in the map, increment its count
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print the character count map
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
        }
    }
}
//NOTE:If we just want to remove space count then use if(c != ' ')
