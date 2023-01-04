public int findMajorityElementpartone(int[] array) {
    // Create a frequency array to store the count of each element
    int[] freq = new int[100001]; // assuming elements are between 0 and 100000
    
    // Iterate through the array and update the count of each element in the frequency array
    for (int element : array) {
        freq[element]++;
    }
    
    // Iterate through the frequency array and find the element with the highest count
    int majorityElement = -1;
    int majorityCount = 0;
    for (int i = 0; i < freq.length; i++) {
        if (freq[i] > majorityCount) {
            majorityElement = i;
            majorityCount = freq[i];
        }
    }
    
    // Return the majority element if it occurs more than N/2 times, otherwise return -1
    return (majorityCount > array.length / 2) ? majorityElement : -1;
}
