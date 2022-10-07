import java.util.Arrays;

public class q8 {
    public static void main(String[] args) {
        int[] arr={5,3,2,4,1};
        int n=arr.length-1;
        System.out.println(Maximize(arr, n));
    }

    static int Maximize(int arr[], int n)
    {
        int sum=0;
        Arrays.sort(arr);
        for(int i=0;i<=n;i++)
        {
          sum+=arr[i]*i;
        }
        //System.out.println(sum);
       return sum; 
    }   
}
