public boolean twosum(int[] arr, int sum) {
    // create an empty HashMap
    Map<Integer, Integer> map = new HashMap<>();

    // do for each element
    for (int i = 0; i < arr.length; i++) {
        // check if pair (arr[i], sum-arr[i]) exists
        if (map.containsKey(sum - arr[i])) {
            return true;
        }
        // store index of current element in the map
        map.put(arr[i], i);
    }

    // we reach here if pair is not found
    return false;
}
