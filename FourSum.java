import java.util.Arrays;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 10;

        findQuads(arr, target);
    }

    public static void findQuads(int[] arr, int target) {
        // sort the array
        Arrays.sort(arr);

        // fix the first element one by one and find other three
        for (int i = 0; i < arr.length - 3; i++) {
            // fix the second element one by one and find other two
            for (int j = i + 1; j < arr.length - 2; j++) {
                // fix the third element and find the fourth
                int k = j + 1;
                int l = arr.length - 1;

                while (k < l) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];

                    if (sum == target) {
                        // quad found
                        System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k] + ", " + arr[l]);

                        // move the pointers to find more quads
                        k++;
                        l--;
                    } else if (sum < target) {
                        // move the 'k' pointer to a higher value
                        k++;
                    } else {
                        // move the 'l' pointer to a lower value
                        l--;
                    }
                }
            }
        }
    }
}
