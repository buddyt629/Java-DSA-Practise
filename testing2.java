import java.util.HashSet;
public class testing2 {
     public static String remove_duplicate(int A[],int N){
       HashSet<Integer> hs=new HashSet<>();
       for(int i=0;i<A.length;i++)
       {
        hs.add(A[i]);
       }
       return hs.toString();
    }
    public static void main(String[] args) {
        int A[]={1,2,2};
        int N=A.length;
        System.out.println(remove_duplicate(A, N));
    }
}


