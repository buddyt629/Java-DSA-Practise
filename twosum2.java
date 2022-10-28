import java.util.HashMap;

public class twosum2 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            
            if(map.containsKey(target-nums[i]))
            {
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
    public static void main(String[] args) {
        twoSum(null, 0);
    }
}

