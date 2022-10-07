import java.util.Arrays;

public class arraysq5 {
    public static boolean check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);

       if(Arrays.equals(A, B))
       {
          return true;
       }
        return false;
    
    }
