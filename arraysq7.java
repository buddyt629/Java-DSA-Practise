import java.util.ArrayList;
import java.util.Arrays;

public class arraysq7 {
    public static void main(String[] args) {
        int arr[]={2,4,1,5,3,8,98,2,4,4,5,3,3,7};
        Arrays.sort(arr);
        ArrayList al=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
               al.add(arr[i+1]);
            }
        }
        System.out.println(al);
    }
}
