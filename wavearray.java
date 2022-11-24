public class wavearray {
    public static void wave(int arr[])
    {
        for(int i=0;i<arr.length-1;i+=2)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,8,9,4,3};
        wave(arr);
    }
}
