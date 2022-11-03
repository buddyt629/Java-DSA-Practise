public class bitwiseexclusiveoperator {
    public static int bitwisecalculator(int nums[])
    {
        int ans=arr[0];
        for(int i=1;i<nums.length;i++)
        {
            ans^=nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
