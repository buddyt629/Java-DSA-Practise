public class kconcatmaximumsum {
    public static long maxSubSumKConcat(int arr[], int k,int sum) {
		if(k==1)
        {
           return kadanes(arr);
        }
        else if(sum<0)
        {
          return kadanestwo(arr);
        }
        else
        {
          return kadanestwo(arr)+ (k-2)*sum;  
        }
	}
    public static int kadanes(int arr[])
    {
        int csum=arr[0];
        int msum=arr[0];
        for(int i=0;i<arr.length;i++)
        {
         if(csum>=0)
         {
            csum+=arr[i];

         }
         else 
         {
            csum=arr[i];
         }
         if(csum>msum)
         {
            msum=csum;
         }

        }
        return msum;
    }
    public static int kadanestwo(int arr[])
    {
        int narr[]=new int[arr.length * 2];
        for(int i=0;i<arr.length;i++)
        {
            narr[i]=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            narr[i+arr.length]=arr[i];
        }
        return kadanes(narr);
    }
    public static void main(String[] args) {
        int arr[]={1,3};
        int sum=0;
       // int n=2;
        int k=3;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
System.out.println(maxSubSumKConcat(arr, k, sum));
    }
}
