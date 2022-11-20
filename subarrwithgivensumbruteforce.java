import java.util.*;

public class subarrwithgivensum {

  public static void main(String[] args) {
    int[] arr = {1, 9, 3, 7};
    int n = arr.length, k = 10;
    System.out.println("Subarray with given sum is: ");
    subArrWithSumKBruteForce(arr, n, k);
  }

  public static void subArrWithSumKBruteForce(int[] arr, int n, int k) {

    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum += arr[j];
        if (sum == k) {
          for (int p = i; p <= j; p++)
            System.out.print(arr[p] + " ");
          System.out.println();
        }
      }
    }
  }
}