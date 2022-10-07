import java.util.Arrays;

public class q10 {
    public static void main(String[] args) {
     int[] arr={6,1,2,8,3,4,7,10,5};
     int n=arr.length;
     System.out.println(MissingNumber(arr, n));   
    }
    
    public static int MissingNumber(int array[], int n) {
        // Your Code Here
    Arrays.sort(array);
     for(int i=0;i<n-1;i++)
     {
        if(array[i+1]!=array[i]+1)
        {
           return array[i]+1;
        }
     }
    
    return 0;
    }
}
