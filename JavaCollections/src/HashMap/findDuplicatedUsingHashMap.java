int[] a = {10, 20, 20, 40, 40, 50}; // INTEGER ARRAY
        System.out.println("Count of integer array is " + a.length);

        // Create a HashMap to store the frequency of each integer
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array and update the frequency in the HashMap
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1); //map.put(key => array value, value => no of occurence of key)
        }

        // Print the duplicates
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) { 
                System.out.println("Duplicate integer value: " + entry.getKey());
            }
        }
