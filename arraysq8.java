import java.util.ArrayList;
import java.util.HashSet;

public class arraysq8 {
    public static void main(String[] args) {
        int arr[]={2,4,1,5,3,8,98,2,4,4,5,3,3,7};
        HashSet hs=new HashSet<>();
        ArrayList al=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!hs.add(arr[i])){
                al.add(arr[i]);
            }
        }
        System.out.println(al);
    }
}
