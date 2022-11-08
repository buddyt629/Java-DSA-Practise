import java.util.ArrayList;
import java.util.List;

public class generateparenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        recurse(res,0,0,"",n);
        return res;
    }
    public static void recurse(List<String> res,int left,int right,String s,int n)
    {
        if(s.length()==n*2)
        {
            res.add(s);
            return;
        }
        if(left<n)
        {
            recurse(res, left+1, right, "(", n);
        }
        if(right<left)
        {
            recurse(res, left, right+1, ")", n);
        }
         
    }

}
