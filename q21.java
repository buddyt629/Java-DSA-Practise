public class q21
{
    public static void main(String[] args) {
        int arr[]={5,5,10,100,10,5};
        int value1=arr[0];
        int value2=Math.max(arr[0], arr[1]);
        int max=0;
        
       for(int i=2;i<arr.length;i++)
       {
        max=Math.max(value1+arr[i], value2);
        value1=value2;
        value2=max;
       }
       System.out.println(max);
    }
}