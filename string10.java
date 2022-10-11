import java.util.LinkedHashSet;

public class string10 {
    public static void main(String[] args) {
        String str="hellogeeks";
        LinkedHashSet<Character> seet=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
        {
            if(!seet.add(str.charAt(i)))
            {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
