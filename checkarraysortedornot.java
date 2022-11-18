public class checkarraysortedornot {
    public static boolean arraySortedOrNot(int[] arr, int n) {
        boolean res=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<=arr[i+1])
            {
                res=true;
            }
            else 
            {
                res=false;
                break;
            }

        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,30};
        int n=arr.length;
        System.out.println(arraySortedOrNot(arr,n));
    }
}
