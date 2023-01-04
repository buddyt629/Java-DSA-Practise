public int findMajorityElementpart2(int[] array) {
    // Create a map to store the count of each element
    Map<Integer, Integer> elementCounts = new HashMap<>();
    
    // Iterate through the array and update the count of each element in the map
    for (int i = 0; i < array.length; i++) {
        int element = array[i];
        elementCounts.put(element, elementCounts.getOrDefault(element, 0) + 1);
    }
    
    // Iterate through the map and find the element with the highest count
    int majorityElement = -1;
    int majorityCount = 0;
    for (Map.Entry<Integer, Integer> entry : elementCounts.entrySet()) {
        if (entry.getValue() > majorityCount) {
            majorityElement = entry.getKey();
            majorityCount = entry.getValue();
        }
    }
    
    // Return the majority element if it occurs more than N/2 times, otherwise return -1
    return (majorityCount > array.length / 2) ? majorityElement : -1;
}
