public static char maxOccurringCharacter(String str) {
    // Create a HashMap to store the character and its count
    HashMap<Character, Integer> map = new HashMap<>();

    // Iterate through the string and update the count of each character in the HashMap
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (map.containsKey(c)) {
            map.put(c, map.get(c) + 1);
        } else {
            map.put(c, 1);
        }
    }

    // Initialize variables to keep track of the maximum occurring character and its count
    char maxChar = ' ';
    int maxCount = 0;

    // Iterate through the HashMap to find the maximum occurring character
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() > maxCount) {
            maxChar = entry.getKey();
            maxCount = entry.getValue();
        }
    }

    // Return the maximum occurring character
    return maxChar;
}
