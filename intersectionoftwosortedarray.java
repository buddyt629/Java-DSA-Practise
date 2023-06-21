public class intersectionoftwosortedarray {
    public int[] intersect(final int[] A, final int[] B) {
     int i=0;
     int j=0;
     int index=0;
     int res[]=new int[A.length];
     while(i<A.length && j<B.length)
     {
         if(A[i]-B[j]==0)
         {
           res[index]=A[i];
           i++;
           j++;
         }
         else if(a[i]<B[i])
         {
            i++;

         }
         else 
         {
            j++;
         }
     }   
     return res;
    }
}
