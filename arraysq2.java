import javax.sound.sampled.ReverbType;

public class arraysq1 {
   public static int binarysearch(int arr[], int n, int k) {
      int start=0;int end=n-1;
      while(start<=end)
      {
        int mid=start+end/2;
        if(arr[mid]==k)
        {
            return mid;
            break;
        }
        else if(k<arr[mid])
        {
            end=mid-1;
        }
        else if(k>arr[mid])
        {
            start=mid+1;
        }
    
      }
      return -1;
    }
 
public static void main(String[] args) {
    int a[]={1,2,3,4,5};
    int k=4;
    int n=5;
  System.out.println(binarysearch(a, n, k));
}
}