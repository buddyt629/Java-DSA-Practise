import java.util.ArrayList;

public class arraysq6 {
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList al=new ArrayList<>();
        int first=-1;
        int last=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                if(first=-1)
                {
                    first=i;
                }
                last=i;
            }
        }
        al.add(first);
        al.add(last);
        return al;
    }
    
}
