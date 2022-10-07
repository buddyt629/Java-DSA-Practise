public class arraysq4 {
    static pair getMinMax(long a[], long n)  
    {
        int max=arr[0];
        int min=arr[0];
      for(int i=0;i<n;i++)
      {
        if(arr[i]>max)
        {
            max=arr[i];
        }
        else if(arr[i]<min)
        {
          min=arr[i];
        }
      }
     return new pair(max,min);
      
    }
    public static void main(String[] args) {
        long arr[]={3,2,1,56,1000,4};
        long n=arr.length;
        System.out.println(getMinMax(arr,n));
    }
}
