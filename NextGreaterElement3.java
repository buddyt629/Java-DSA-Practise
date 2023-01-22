import java.util.Stack;
import java.util.HashMap;
public class NextGreaterElement3 {

    public static void main(String[] args) {
        int[] arr = {4,5,2,25};
        int[] result = nextGreaterElementusinghashmap(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(arr[i] + " -- " + result[i]);
        }
    }

    public static int[] nextGreaterElementusinghashmap(int[] nums) {
        int[] res = new int[nums.length];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],i);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    res[i] = nums[j];
                    break;
                }
            }
            if(j==nums.length)
                res[i] = -1;
        }
        return res;
    }

}
