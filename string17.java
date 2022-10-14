import java.util.ArrayList;

public class string17 {
    
    public static ArrayList<Integer> factorial(int N){
      ArrayList<Integer> al=new ArrayList<>();
        int ans=1;
          for(int i=N;i<=1;i--)
        {
            ans*=N;
        }
        al.add(ans);
        return al;
      }
      public static void main(String[] args) {
          int n=10;
          System.out.println(factorial(n));
      }
}
