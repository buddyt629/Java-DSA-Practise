public class threesumbruteforce {
    public int[] threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet();
      for(int i=0;i<nums.length-2;i++)
      {
        for(int j=i+1;i<nums.length-1;j++)
        {
            for(int k=j+1;i<nums.length;k++)
           {
               if(nums[i]+nums[j]+nums[k]==0)
               {
                List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                Collections.sort(list);
                resultSet.add(list);
               }
           }  
        }  
      } 
      return new ArrayList<>(resultSet); 
    }
}
