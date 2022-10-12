import java.util.Map;
import java.util.TreeMap;

public class string15 {
    public static int romanToDecimal(String str) {
     TreeMap<Character,Integer> map=new TreeMap<>();
     int ans=0;

     map.put('I', 1);
     map.put('V', 5);
     map.put('X',10);
     map.put('L', 50);
     map.put('C', 100);
     map.put('D', 500);
     map.put('M', 1000);
     for(int i=0;i<str.length();i++){
     if(i<str.length()&& map.get(str.charAt(i))<map.get(str.charAt(i+1)))
     {
        ans=ans+map.get(str.charAt(i+1))-map.get(str.charAt(i));
        i++;
     }
     else ans+=map.get(str.charAt(i));
    } 
     return ans;
  
    }
    public static void main(String[] args) {
        String str="MCMXC";
        System.out.println(romanToDecimal(str));
    }
}
