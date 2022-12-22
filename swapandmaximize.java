public class swapandmaximize {
    public static long maxSum(long arr[] ,int n)
    {
        Arrays.sort(arr);

        long sum=0;

        for(int i=0;i<n/2;i++){

            sum=sum+Math.abs(arr[i]-arr[n-1-i]);
        }
        return 2*sum;
    }
    public static void main(String[] args) {
        System.out.println(maxSum(null, 0));
    }
}
