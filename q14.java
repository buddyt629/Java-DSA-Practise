public class q14 {
    public static void main(String[] args) {
            int arr[]={1,4,2,5};
            int k=6;
            int count=0;
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k)
                {
                   count ++;
                }
            }
            }
            System.out.println(count);
    }
}