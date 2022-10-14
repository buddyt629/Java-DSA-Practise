import java.util.Arrays;

public class arraysq13 {
    public static void main(String[] args) {
        int arr[]={6,1,2,8,3,4,7,10,5};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1]-1)
            {
            System.out.println(arr[i+1]-1);
            }
        }
    }
}
