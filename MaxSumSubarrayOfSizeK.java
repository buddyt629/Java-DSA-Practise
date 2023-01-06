import java.util.Scanner;

class MaxSumSubarrayOfSizeK {    
    private static int findSumMaxSubarrayOfSizeK(int[] a, int k) {
        if(k == 0 || a.length == 0) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        int windowStart = 0;
        int windowSum = 0;

        for(int windowEnd = 0; windowEnd < a.length; windowEnd++) {
            windowSum += a[windowEnd]; // Add the next element to the window
            
            if(windowEnd-windowStart+1 == k) { // When we hit the window size. Update maximum sum, and slide the window
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= a[windowStart]; // Subtract the element going out of the window
                windowStart++; // Slide the window
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int k = keyboard.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = keyboard.nextInt();
        }

        keyboard.close();
        
        System.out.printf("Max sum subarray of size %d = %d%n", k, findSumMaxSubarrayOfSizeK(a, k));
    }
}
