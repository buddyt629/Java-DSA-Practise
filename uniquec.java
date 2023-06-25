import java.util.HashMap;
import java.util.HashSet;

public class uniquec
{
    public static void main(String[] args)
    {
        String s="aaabauif";
        HashMap<Character,Integer> map = new HashMap<>();
for(int i = 0 ; i < s.length() ; i++){
map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
}
for(int i = 0 ; i < s.length() ; i++){
if(map.get(s.charAt(i))==1) {
System.out.println(s.charAt(i));
break;
}
 }
}
}