import java.util.HashMap;

public class romantointeger {
    public static int romantoint(String str)
    {
        int n=str.length();
       HashMap<Character,Integer> map=new HashMap<>();
       
       map.put('I', 1);
       map.put('V', 5);
       map.put('X', 10);
       map.put('L', 50);
       map.put('C', 100);
       map.put('D', 500);
       map.put('M', 1000);
    
       int ans=map.get(str.charAt(n-1));

       for(int i=n-2;i>=0;i--)
       {
        char curr=str.charAt(i);
        char next=str.charAt(i+1);

        if(map.get(curr)<map.get(next))
        {
            ans-=map.get(curr);

        }
        else ans+=map.get(curr);
       }
        return ans;
    
    }
    public static void main(String[] args) {
        String str="IXI";
        System.out.println(romantoint(str));
    }
}
