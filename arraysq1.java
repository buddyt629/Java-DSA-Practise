import javax.sound.sampled.ReverbType;

public class arraysq1 {
    public static int palinArray(int[] a, int n)
    {
        
           for(int i=0;i<n;i++)
           {
            int rev=0;int rem=0;
           int no=a[i];
           int temp=a[i];
            while(no!=0)
            {
             rem=no%10;
             rev=rev*10+rem;
             no=no/10;
            }
           if(temp!=rev)
           {
            return 0;
           }
          
           }
return 1;

    }
public static void main(String[] args) {
    int a[]={111,222,333,444,555};
    int n=a.length;
  System.out.println(palinArray(a, n));
}
}