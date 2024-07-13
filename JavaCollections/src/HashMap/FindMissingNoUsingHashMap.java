int[] nums = {10,1, 5, 4, 6};

        // Step 1: Initialize HashMap to count occurrences
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Determine range of numbers
        Arrays.sort(nums);
        int max = nums[nums.length - 1];

        // Step 3: Find missing numbers using HashMap
        List<Integer> missing = new ArrayList<>();
        for (int i = 0; i <= max-1; i++) {
            if (!map.containsKey(i)) {
                missing.add(i);
            }
        }
        System.out.println("List of missing no's using hashmap" + missing);
