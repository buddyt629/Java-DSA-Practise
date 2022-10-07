public class q6 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int N=5;
        int k=3;
     System.out.println(search(arr, N, k));  
    }
    static int search(int arr[], int N, int X)
    {
        
        for(int i=0;i<N-1;i++)
        {
            if(arr[i]==X)
            {
                return i;
            }
        
        }
        return -1;
        
    }
}
