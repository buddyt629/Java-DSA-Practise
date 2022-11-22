import java.util.Arrays;

public class anagramcheck {
    public static boolean check(String str1,String str2)
    {
        Boolean res=false;
        char sttr1[]=str1.toCharArray();
        char sttr2[]=str2.toCharArray();
        if(Arrays.equals(sttr1, sttr2))
        {
            res=true;
        }
        return res;
    }
    public static void main(String[] args) {
        String str1="geeksforgeeks";
        String str2="geeksforgees";
        System.out.println(check(str1, str2));
    }
}
