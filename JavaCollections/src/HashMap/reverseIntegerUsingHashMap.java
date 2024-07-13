int number = 1234;
        int position = 0;
        Map<Integer, Integer> digitMap = new LinkedHashMap<>(); // Use LinkedHashMap to maintain insertion order

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            digitMap.put(position, digit); // Store digit with its position
            number = number / 10; // Remove the last digit from the original number
            position++;
        }

        // Print digits in reverse order
        for (int i = 0; i <=digitMap.size() - 1; i++) {
            int digit = digitMap.get(i);
            System.out.println("Position " + i + ": " + digit);
        }
