public class implementatoi {
    public static int atoibasic()
    {
     int result = 0;
 int sign = 1;
 int n = str.length();
 int i=0;
  if(str.charAt(i) == '-') 
      sign = -1;
      i++;
  }
 for(;i<n;i++) {
    if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || 
    str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' ||
    str.charAt(i) == '-' || str.charAt(i) == '+') {
        return -1;
    }
  result = result*10+str.charAt(i)-'0';
 }
 return result*sign;
 }
    public static void main(String[] args) {
        
    }
}
