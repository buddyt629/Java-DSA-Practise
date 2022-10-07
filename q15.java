import java.util.ArrayList;
import java.util.Collections;

public class q15 {
    public static void main(String[] args) {
        int max=-1;
        int arr[]={16,17,4,3,5,2};
     ArrayList<Integer> al=new ArrayList<Integer>();
     for(int i=arr.length-1;i>=0;i--){
        if(arr[i]>=max)
        {
            max=arr[i];
            al.add(max);
        }

     }
     Collections.reverse(al);
        System.out.println(al); 
    }
}
