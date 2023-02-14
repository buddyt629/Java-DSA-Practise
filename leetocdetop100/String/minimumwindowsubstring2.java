import java.util.HashMap;

public class minimumwindowsubstring2
{
    public static String minwindow(String s,String t)
    {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(int i=0;i<t.length();i++)
        {
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0)+1);
        }
        int mct=0,dmct=0;
        int i=-1,j=-1;

        while(true)
        {
            while(i<s.length() && mct<dmct)
            {
             i++;
             map1.put(s.charAt(i), map1.getOrDefault(map1, 0)+1);
             
             if(map1.getOrDefault(s.charAt(i), 0)<map2.getOrDefault(s.charAt(i), 0))
             {
                mct++;
             }

            }
        
        while(j<i && mct==dmct)
        {
            String ans=s.substring(j+1, i+1);
            if(ans.length() == 0 || pans.length() < ans.length())
            {
                ans = pans;
            }
            j++;
            if(map1.get(s.charAt(j))==1)
            {
                map1.remove(s.charAt(i));
            }
            else 
            {
                map1.put(s.charAt(i), map1.get(s.charAt(i))-1);

            }
            if(map1.getOrDefault(ch , 0) < map2.getOrDefault(ch , 0))
                {
                    mct--;
                }
        }
    }
}
}