public class arraysq9 {
    public static void bubblesort(int arr[])
    {
  
        for(int pass=0;pass<arr.length;pass++){
            int temp=0;
       for(int i=0;i<arr.length-1-pass;i++)
       {
        if(arr[i]>arr[i+1])
        {
             temp=arr[i];
             arr[i]=arr[i+1];
             arr[i+1]=temp;
        }
       }     }
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
    public static void main(String[] args) {
        int[] arr={10,50,78,20,11,94,52,1};
        bubblesort(arr);
       }
}
