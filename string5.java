import java.util.HashSet;

public class string5 {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        String ans="";
        HashSet<String> set=new HashSet<String>();
        for(int i=0;i<str.length();i++)
        {
            set.add(str.charAt(i));
            ans+=str.charAt(i);
        }
    
        System.out.println(ans);
    }

}