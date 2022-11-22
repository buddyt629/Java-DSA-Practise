import java.util.HashSet;

public class firstrepeatedcharacter {
    public static void find(String str)
    {
        HashSet<Character> hs=new HashSet<>();
         for(int i=0;i<str.length();i++)
         {
            if(!hs.add(str.charAt(i)))
            {
                System.out.println(str.charAt(i));
                break;
            }
         }
    }
    public static void main(String[] args) {
        String str="geeksforgeeks";
        find(str);
    }
}
