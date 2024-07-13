 Map<String, Integer> charCountMap = new HashMap<>();
        charCountMap.put("a", 1);
        charCountMap.put("b", 2);
        charCountMap.put("c", 3);

        int max = 0;  // Set max to the minimum possible value
        String maxKey = ""; // To store the key with the maximum value

        for (Map.Entry<String, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Count of " + entry.getKey() + " is: " + entry.getValue());
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey(); // Update the key with the maximum value
            }
        }

        System.out.println("Key with the maximum value: " + maxKey + ", Maximum value: " + max);
