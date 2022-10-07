import java.util.Arrays;

public class q11 {
    static void Rearrange(int arr[], int n)
    {
       int negInd=0,left=0;
       int ans[]=new int[n];
       
       for(int i=0;i<n;i++){
           if(arr[i]<0){
               negInd++;
           }
       }
       
       for(int i=0;i<n;i++){
           if(arr[i]<0){
               ans[left++]=arr[i];
           }else{
               ans[negInd++]=arr[i];
           }
       }
       
       for(int i=0;i<n;i++){
           arr[i]=ans[i];
       }
       
    }
    public static void main(String[] args) {
        int a[]={2, -4, 7, -3, 4};
        int n=5;
      Rearrange(a,n);

      for(int i=0;i<n;i++){
        System.out.println(a
        
        [i]);
    }
    }
}
