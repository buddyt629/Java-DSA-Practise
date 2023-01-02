public class kadanes {
public static long maxSubarraySum(int arr[], int n){
        
        long curSum = 0, maxSum = arr[0];
  
  
for(int i=0; i<n; i++){
   curSum+=arr[i];
   if(maxSum<curSum)
          maxSum=curSum; 
   
   if(curSum<0)
       curSum=0;

  }
  return maxSum;

}
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    int n=arr.length;
    System.out.println(maxSubarraySum(arr, n));
}
}
