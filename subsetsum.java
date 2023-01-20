public class subsetsum{
    public static void sumofsubsets(int[] arr, int index, String current,int sum) {
        if (index == arr.length) {
            System.out.print(sum+" ");
            return;
        }
        printSubsequences(arr, index + 1, current,sum);
        printSubsequences(arr, index + 1, current + " " + arr[index],sum+arr[index]);
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        printSubsequences(arr, 0, "",0);  
    }
    
    }