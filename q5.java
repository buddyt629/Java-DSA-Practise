public class q5 {
    public static void main(String[] args) {
        int[] arr={11,5,1345,70,13,456};
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length-1;i++){
         if(arr[i]>max)
         {
            max=arr[i];
         }
         else if(arr[i]<min)
         {
             min=arr[i];

         }
        }
    
        System.out.println("Max element is:"+max);
        System.out.println("Min element is:"+min);
    }
}
