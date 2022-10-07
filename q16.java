public class q16 {
    //Kadanes algorithm 
    //maximum sum in an array
    public static void main(String[] args) {
    int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
    int max_sum=arr[0];int sum=0;
    for(int i=0;i<arr.length;i++)
    {
    sum+=arr[i];
    if(sum>max_sum)
    {
        max_sum=sum;
    }
    else if(sum<0)
    {
        sum=0;
    }
    }
    System.out.println(max_sum);
}
}