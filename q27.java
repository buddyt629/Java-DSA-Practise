import java.util.Arrays;
import java.util.HashMap;

public class q27 {
    public static void main(String[] args)
 {
    int arr[]={3,1,3,3,2,2};
    int n=arr.length;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++)
    {
        if(map.containsKey(a[i]))
        {
            map.put(a[i], map.get(a[i]+1));
        }
        map.put(a[i],1);
    }
    for(int i=0;i<n;i++)
    {
        if(map.get(a[i])>n/2)
        {
            return a[i];
        }
        else 
        return -1;
    }
    
 }
}
