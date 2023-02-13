import java.util.HashMap;

class characterReplacement2 {
    public int characterReplacement(String s, int k) {
   int i=0;int j=0;
   int maxcount=0;
   int max=0;
   int n=s.length;
 HashMap<Character,Integer> map=new HashMap<>();
   while(j<n)
   {
      char right=s.charAt(j);
      map.put(right, map.getOrDefault(right,0)+1);
      maxcount=Math.max(maxcount,map.get(right));
      if(j-i+1-maxcount>k)
      {
        char left=s.charAt(i);
        i++;
        map.put(left, map.get(left)-1);
      }
      max=Math.max(max,j-i+1);
      j++;  
   }
   return max;

 
    }
}