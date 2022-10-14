public class arraysq12 {
    public static void binarysearch(int arr[],int element)
    {
        int start=0;int end=arr.length-1;
        while(start<end)
        {
         int mid=(start+end)/2;
          if(arr[mid]==element)
          {
            System.out.println(mid);
           // System.out.println("okay");
            break;
          }
          else if(arr[mid]>element)
          {
            end=mid-1;
          }
          else if(arr[mid]<element)
          {
            start=mid+1;
          }
        }
    
    }
    public static void main(String[] args) {
        int arr[]={11,12,78,95,920,1111};
        binarysearch(arr, 12);
    }
}
