public class arraysq15 {
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4};
      int sum=0;int maxi=arr[0];
      for(int i=0;i<arr.length;i++)
      { sum+=arr[i];
        if(sum>maxi)
        {
            maxi=sum;
        }
        else if(sum<0)
        {
            sum=0;
        }
      }
      System.out.println(maxi);

    }
}
