import java.util.HashSet;

public class string6 {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        String ans="";
        HashSet<Character> set=new HashSet<Character>();
        for(int i=0;i<str.length();i++)
        {
            if(!set.contains(str.charAt(i))){
            set.add(str.charAt(i));
            ans+=str.charAt(i);
        }
    }
        System.out.println(ans);
    }
}
