public class binarysearch
{
  public static int binary(int arr[],int k)
  {
     int start=0;
     int end=arr.length;
     while(start<end)
     {
        int mid=(start+end)/2;
        if(arr[mid]==k)
        {
             return mid;
        }
        else if(arr[mid]<k)
        {
            start=mid+1;
        }
        else if(arr[mid]>k)
        {
            end=mid;
        }
        
     }
    return -1;
  }
  public static void main(String[] args) {
    int arr[]={1,2,4,6,9,78};
    int k=78;
    System.out.println(binary(arr, k));
  }
}