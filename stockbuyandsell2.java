// this code will give maximum profit if the questions says that wwe can buy and sell thw stock many times to gain maximum profit out nof my working days

public class stockbuyandsell2 {
    public static int stockbuyandsell(int arr[])
    {
        int profit=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                profit+=arr[i]-arr[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={100, 180, 260, 310, 40, 535, 695};
    //    int n=arr.length;
        System.out.println(stockbuyandsell(arr));
    }
}
