import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
    public static ArrayList<int[]> findTriplets(int[] arr) {
        ArrayList<int[]> triplets = new ArrayList<int[]>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (i == 0 || (i > 0 && arr[i] != arr[i - 1])) {
                int low = i + 1;
                int high = arr.length - 1;
                int sum = 0 - arr[i];
                while (low < high) {
                    if (arr[low] + arr[high] == sum) {
                        triplets.add(new int[] {arr[i], arr[low], arr[high]});
                        while (low < high && arr[low] == arr[low + 1]) {
                            low++;
                        }
                        while (low < high && arr[high] == arr[high - 1]) {
                            high--;
                        }
                        low++;
                        high--;
                    } else if (arr[low] + arr[high] < sum) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        ArrayList<int[]> triplets = findTriplets(arr);
        for (int[] triplet : triplets) {
            System.out.println(Arrays.toString(triplet));
        }
    }
}
