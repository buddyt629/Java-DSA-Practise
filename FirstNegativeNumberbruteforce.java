import java.util.Scanner;

class FirstNegativeNumberbruteforce {
    private static int[] findFirstNegativeNumberInSubarrayOfSizeK_BruteForce(int[] a, int k) {
        int n = a.length;
        int[] firstNegativeNumbers = new int[n - k + 1];
        int idx = 0;

        for(int i = 0; i <= n-k; i++) {
            //int firstNegativeNum = 0;
            for(int j = i; j < i+k; j++) {
                if(a[j] < 0) {
                    firstNegativeNumbers[idx++]= a[j];
                    break;
                }
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

        int[] firstNegativeNumbers = findFirstNegativeNumberInSubarrayOfSizeK_BruteForce(a, k);
        for (int i = 0; i < firstNegativeNumbers.length; i++) {
            System.out.print(firstNegativeNumbers[i] + " ");
        }
        System.out.println();
    }
}