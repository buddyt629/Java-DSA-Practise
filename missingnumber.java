public class missingnumber {
    public static int  missingnumber(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        int calcsum=arr.length*(arr.length+1)/2;
        return calcsum-sum;
    }
}
