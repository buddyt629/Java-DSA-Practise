public class string1{
public static void main(String[] args) {
    String str="reverse";
    String ans="";
    for(int i=str.length()-1;i>=0;i--)
    {
      ans=ans+str.charAt(i);
    }
    System.out.println(ans);
}
}