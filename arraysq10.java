public class arraysq10 {
    public static void selection(int arr[])
    {
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            int smallest=i;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[smallest]>arr[j])
            {
                smallest=j;
            }

        }
        temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+":");
        }
    }
    public static void main(String[] args) {
       int arr[]={10,50,78,20,11,94,52,1};
        selection(arr);
    }
}
