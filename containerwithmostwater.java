public class containerwithmostwater {
    public static int containerwidth(int[] arr)
    {
      int i=0;
      int j=arr.length-1;
      int water=0;
      while(i<j)
      {
        int height=Math.min(arr[i], arr[j]);
        int width=j-i;

        water=Math.max(water, height*width);
        if(arr[i]<arr[j])
        {
            i++;
        }
        else j--;
      }
      return water;

    }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println(containerwidth(arr));
    }
}
