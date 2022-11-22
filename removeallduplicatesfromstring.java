import java.util.HashSet;

public class removeallduplicatesfromstring
{
    public static void removeduplicates(String str)
    {
        HashSet<Character> hs=new HashSet<>();
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            if(!hs.contains(str.charAt(i)))
            {
                hs.add(str.charAt(i));
                ans+=str.charAt(i);
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String str="geeksforgeeks";
        removeduplicates(str);
    }
}