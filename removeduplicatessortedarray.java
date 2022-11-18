import java.util.HashSet;
public class removeduplicatesunsortedarray {
   public static  int remove_duplicate(int A[],int N){
       HashSet<Integer> hs=new HashSet<>();
       for(int i=0;i<A.length;i++)
       {
        hs.add(A[i]);
       }
       return hs;
    }
    public static void main(String[] args) {
        int A[]={1,2,1,4,5,6,7};
        int N=A.length;
        System.out.println(remove_duplicate(A, N));
    }
}
