public class arraysq11 {
    public static void insertionsort(int arr[])
    {
         for(int i=0;i<arr.length;i++)
         {
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current)
            {
                arr[j+1]=arr[j];
                j--;
            }
             arr[j+1]=current;
         }
         for(int i=0;i<arr.length;i++)
         {
            System.out.print(arr[i]+" ");
         }
    }
    public static void main(String[] args) {
        int arr[]={10,50,78,20,11,94,52,1};
        insertionsort(arr);
    }
}
