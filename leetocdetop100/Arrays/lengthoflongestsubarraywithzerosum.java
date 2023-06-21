import java.util.HashMap;

public class lengthoflongestsubarraywithzerosum {
    public static int maxLen(int arr[], int n)
    {
      HashMap<Integer,Integer> map=new HashMap<>();
      int maxx=0;
      int sum=0;
      for(int index=0;index<n;index++)
      {
        sum+=arr[index];
        if(sum==0)
        {
            maxx=index+1;

        }
        else if(map.get(sum)!=null)
            {
                maxx=Math.max(maxx, index-map.get(sum));

            }
        else 
        {
            map.put(sum,index);
        }

      }
      return maxx;
    }
}
