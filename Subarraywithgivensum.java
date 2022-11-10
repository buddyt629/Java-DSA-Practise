import java.util.ArrayList;
import java.util.HashMap;

public class Subarraywithgivensum {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
      HashMap<Integer,Integer> map=new HashMap<>();
      int start=0;
      int end=-1;
      int currsum=0;
      for(int i=0;i<arr.length;i++)
      {
        currsum+=arr[i];
        if(currsum=s)
        {
            start=0;end=i;
            break;
        }
        if(map.containsKey(currsum-s))
        {
            start=map.get(currsum-s)+1;
            end=i;
            break;

        }
        map.put(currsum,i);
        if(end==-1)
        {
            System.out.println("Not found");
        }
        else System.out.pritnln("Found");
      }
    }
}
