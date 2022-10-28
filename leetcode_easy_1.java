public class leetcode_easy_1 {
    public static int[] twoSum(int[] arr, int target) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                   return new int[]{i,j};
                }
            }
        }
    return new int[]{};


    }
    public static void main(String[] args) {
        int arr[]={3,2,4};int target=6;
      int[] res=twoSum(arr, target);
      for(int i=0;i<=res.length;i++){
      System.out.println(res);
    }}
}
