import javax.lang.model.util.ElementScanner14;

public class q3
{
   public static void binarysearch(int arr[], int n, int k) {
    int start=0;
    int end=arr.length-1;
   
    while(start<end)
    {
      int mid=(start+end)/2;
      if(arr[mid]==k)
      {
        System.out.println(mid);
        break;
      }
      else if(arr[mid]>k)
      {
         end=mid-1;
      }
      else 
      {start=mid+1;}
    }
    //mid=(start+end)/2;
  }
  public static void main(String[] args) {
   int []arr={1,2,3,4,5};
   int n=5;
   int k=4;
   binarysearch(arr, n, k);
  }
}