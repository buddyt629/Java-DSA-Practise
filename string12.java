public class string12 {
   public static void main(String[] args) {  
   String str="abba";
   String temp=str; 
   String rev="";
    for(int i=str.length()-1;i>=0;i--)
    {
        rev+=str.charAt(i);
    }
  if(rev.equals(temp))
  {
  System.out.println("palindorme");
  }
  else System.out.println("not a palindorme");

}
}
