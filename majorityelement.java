import java.util.HashMap;

public class majorityelement {
    public int majorityElement(final int[] A) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=A.length;
        int ans=-1;
        for(int i=0;i<n;i++)
        {
          int value=mp.getOrDefault(A[i], 0);
          mp.put(A[i],value+1);

        }
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                ans=it.getKey();
            }
        }
        return ans;
    }
}
