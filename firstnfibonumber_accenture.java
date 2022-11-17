public class firstnfibonumber_accenture {
    public static long[] printFibb(int n) 
    {
        long ar[]=new long[n];
        long a=0;
        long b=1;
        long c=0;
        ar[0]=b;
        for(int i=1;i<n;i++){
            c=a+b;
            ar[i]=c;
            a=b;
            b=c;
        }
     return ar;
 
    }
    // long[]arr = new long[n];
    // arr[0] = 1;
    // if(n == 1){
    //     return arr;
    // }
    // arr[1] = 1;  
    // for(int i = 2; i < n; i++){
    //     arr[i] = arr[i - 1] + arr[i - 2];
    // }
    // return arr;
   
}
