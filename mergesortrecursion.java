public static void mergeSort(int[] array) {
    if (array.length > 1) {
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }
}

public static void merge(int[] array, int[] left, int[] right) {
    int i = 0, j = 0, k = 0;
    while (i < left.length && j < right.length) {
        if (left[i] <= right[j]) {
            array[k] = left[i];
            i++;
        } else {
            array[k] = right[j];
            j++;
        }
        k++;
    }
    while (i < left.length) {
        array[k] = left[i];
        i++;
        k++;
    }
    while (j < right.length) {
        array[k] = right[j];
        j++;
        k++;
    }
}
