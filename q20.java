import java.util.HashMap;

class q20 {
    int getOddOccurrence(int[] arr, int n) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<n;i++)
      {
          if(map.containsKey(arr[i]))
          {
            map.put(a[i], map.get(arr[i])+1);
          }
          else
          map.put(arr[i],1);
      }
      int temp=0;
      for(int i=0;i<n;i++)
      {
        if(map.get(arr[i])%2!=0)
        {
            temp=i;
        }
      }
      return temp;
      
    }
}