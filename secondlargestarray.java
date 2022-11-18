public class secondlargestarray {
    public static void main(String[] args) {
               Arrays.sort(arr);
               for(int i = n-1; i > 0; i--){
                   if(arr[i] != arr[i-1]){ // check if last numbers are not same
                     return arr[i-1];  
                   }
               }
               return -1;
        
        
    }
}
