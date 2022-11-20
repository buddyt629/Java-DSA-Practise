public class revise2 {
    public static long kadanesalgo(int arr[],int n)
    {
       long sum=0;
       long max=arr[0];
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum>max)
            {
               max=sum;
            }
            else if(sum<0)
            {
                sum=0;
            }

        }return max;
    }
    public static void main(String[] args) {
        int arr[]={-81,-71,98,55,76,-52,68,15,-77,77,-42,-70,-53,86,29,-30,14,25,-94,73,-68,81,44};
        int n=arr.length;
        System.out.println(kadanesalgo(arr, n));
    }
}
