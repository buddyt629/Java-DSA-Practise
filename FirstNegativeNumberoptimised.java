import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class FirstNegativeNumberoptimised {
    private static int[] findFirstNegativeNumberInSubarrayOfSizeK(int[] a, int k) {
        int n = a.length;
        int[] firstNegativeNumbers = new int[n - k + 1];
        int idx = 0;

        Queue<Integer> q = new LinkedList<>();

        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < n; windowEnd++) {
            if (a[windowEnd] < 0) {
                q.add(a[windowEnd]);
            }

            if (windowEnd - windowStart + 1 == k) { // Calculate result and Slide the window
                if (q.isEmpty()) {
                    firstNegativeNumbers[idx++] = 0;
                } else {
                    int num = q.peek();
                    firstNegativeNumbers[idx++] = num;

                    // Remove a[windowStart] from the queue since we need to slide the window now.
                    // But only if it was added to the queue previously
                    if (num == a[windowStart]) {
                        q.remove();
                    }
                }
                windowStart++; // Slide the window ahead
            }
        }

        return firstNegativeNumbers;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = keyboard.nextInt();
        }

        int k = keyboard.nextInt();

        keyboard.close();

        int[] firstNegativeNumbers = findFirstNegativeNumberInSubarrayOfSizeK(a, k);
        for (int i = 0; i < firstNegativeNumbers.length; i++) {
            System.out.print(firstNegativeNumbers[i] + " ");
        }
        System.out.println();
    }
}
