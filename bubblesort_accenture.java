public class bubblesort_accenture {
    public static void bubbleSort(int arr[], int n)
    {
       for(int i=0;i<arr.length;i++)
       {
        for(int j=0;j<arr.length-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
       }
    }
       public static void main(String[] args) {
        
       }
}
