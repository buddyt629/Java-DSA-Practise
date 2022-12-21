import java.util.* ;
import java.io.*; 

public class maximumsubarraysum {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long sum=0;long curr_sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(curr_sum<sum)
            {
                curr_sum=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return curr_sum;
	}

}
