import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class string7 {
    static ArrayList <String> possibleWords(int a[], int N)
    {
       ArrayList<String> res=new ArrayList<String>();
       if(N==0)
       {
        return res;
       }
       HashMap<Integer,String> map=new HashMap<Integer,String>();
      
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi"); 
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    

    }
    public static void backtrack(int a[],int i,HashMap<String> map,StringBuilder sb,List<String> res)
    {
       if(sb.length()==a.length)
       {
        res.add(sb.charAt(i));
        return ;
       }
       String element=map.get(i);
       for(int j=0;j<element.length();j++)
       {
        sb.append(element.charAt(j));
        backtrack(a,i+1,map,sb,res);
        sb.deleteCharAt(sb.length()-1);
       }
    }
}
