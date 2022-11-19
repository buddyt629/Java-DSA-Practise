public class QuickLeftRotation {
    public static void rotate(int arr[],int k,int n)
    {
      
        k = k % n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
    }
    public static void reverse(int arr[],int start,int end)
    {
        while(start < end) {
            long temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        rotate(null, 0, 0);
    }
}
