public class q19
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int product=1;
        int n=arr.length;
        int[] newarr=new int[arr.length];
        for(int i=0;i<n;i++)
        {
            product=product*arr[i];
           
        }
        for(int i=0;i<n;i++)
        {
            newarr[i]=product/arr[i];

        }
        for(int i=0;i<n;i++)
        {
            System.out.print(newarr[i]+" ");
        }
    }
}