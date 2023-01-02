// this will give maximum profit in case if question says we can buy and sellk the stock only once in our working days 
public class stockbuyandsellpractise
{
    public static int max_profit(int arr[],int n)
    {
        int max=0;
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            min=Math.min(min, arr[i]);
            max=Math.max(max, arr[i]-min);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={100, 180, 260, 310, 40, 535, 695};
        int n=arr.length;
        System.out.println(max_profit(arr, n));
    }
}