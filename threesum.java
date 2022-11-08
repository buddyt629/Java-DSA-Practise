import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threesum
{
    public  List<List<Integer>> threeSum(int[] nums) {
     Set<List<Integer>> set=new HashSet<>();
        int i=0;
    int n=nums.length;
    Arrays.sort(nums);
    for(i=0;i<n-2;i++)
    {
        int j=i+1;
        int k=n-1;
        while(j<k)
        {
            sum=nums[i]+nums[j]+nums[k];
            if(sum==0)
            {
                set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));

            }
            else if(sum>0) k--;
            else if(sum<0) j++;
        }

    }
    return new ArrayList<>(res);
    }
}