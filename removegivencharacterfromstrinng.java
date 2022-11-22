public class removegivencharacterfromstrinng {
    public static String remove(String str1,Character c)
    {
      int i=0;
      String ans="";
      while(i<str1.length())
      {
        if(str1.charAt(i)==c)
        {
            i++;
        } 
        ans+=str1.charAt(i++);
      }
      return ans;
    }
    public static void main(String[] args) {
        String str="geeksforgeeks";
        Character c='g';
        System.out.println(remove(str, c));
    }
}
