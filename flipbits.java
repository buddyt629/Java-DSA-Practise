import java.util.* ;
import java.io.*; 
public class flipbits    {
	public static int flipBits(int[] arr,int n) {
          int totalones=0;      
        int max=0;        int sum=0;   int val=0;
        for(int i=0;i<arr.length;i++){      
            if(arr[i]==1)            
                totalones++;         
            if (arr[i] == 1) {
  val = -1;
} else {
  val = 1;
            }   
            sum+=val;       
            if(max<sum)     
                max=sum;    
            if(sum<0)         
                sum=0;      
        }       
        return totalones+max;
    } }  
	

