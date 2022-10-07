import java.util.Arrays;

public class q26 {
    public static void main(String[] args) {
        int arr[]={7,10,4,20,15};
        int k=5;
        Arrays.sort(arr);   ////4,7,10,15,20
        for(int i=0;i<arr.length;i++)
        {
            if(i==k-1)
            {
                System.out.println(arr[i]);
            }
        }
    
    }
}
