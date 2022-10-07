public class q13 {

    public static void main(String[] args) {
        
    }
    public static int equilibriumPoint(long arr[], int n) {

      int rightsum=0;int sum=0;int leftsum=0;
      
      for(int i=0;i<n-1;i++)
      {
        sum+=arr[i];
      }
      rightsum=sum;
      for(int i=0;i<nj-1;i++)
      {
        rightsum-=arr[i];
        if(rightsum==leftsum)
        {
            return i+1;
        }
        else
        leftsum+=arr[i];
      }
      return -1;
    }
}
