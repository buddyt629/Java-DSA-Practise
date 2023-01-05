import java.util.Arrays;

public class test1 {
    public static int test(int arr[])
    {
        int count=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]+1==arr[i+1])
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={3,8,5};
      System.out.println(test(arr));
    }
}
