public class maxsubarraywithsizek{
    public static int maxsubarraywithsizek(int arr[])
    {
        int max_sum=0;int sl_sum=0;
        for(int i=0;i<n-k;i++)
        {
          for(int j=i;j<k;j++)
          {
            sum+=arr[j];
            max_sum=Math.max(max_sum, sum);

          }
        }
    }
    return max_sum;
}