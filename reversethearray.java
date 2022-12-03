public class reversethearray
{
    public static void arrayreverse(int arr[])
    {
        int n=arr.length;
        for(int i=n;i>0;i--)
        {
               swap(arr[i],arr)
        }
    }
    public static swap(int ele1,int ele2)
    {
        int temp=ele1;
        ele1=ele2;
        ele2=temp;
    }
    public static void main(String[] args) {
        
    }
}