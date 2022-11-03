public class validanagram {
    public static boolean isAnagram(String s, String t) {
      char c[]=s.toCharArray();
      char d[]=s.toCharArray();
       if(Arrays.equals(c,d))
       {
        return true;
       }
       return false;
    
    }
    public static void main(String[] args) {
        
    }
}
