import java.util.ArrayList;
import java.util.HashMap;

public class q22 {
    public static void main(String[] args) {
        int arr1[]={10, 5, 2, 23, 19};
        int arr2[]= {19, 5, 3};
        ArrayList<Integer> list=new ArrayList<Integer>();
       
        for(int i=0;i<arr1.length;i++)
        {
            list.add(arr1[i]);
        }
        int k=0;
        for(int i=0;i<arr2.length;i++)
        {
            if(!list.contains(arr2[i]))
            {
                k=1;
                break;
            }
        }
        if(k==0)
        System.out.println("Yes");
        else 
        System.out.println("NO");
    }
}
