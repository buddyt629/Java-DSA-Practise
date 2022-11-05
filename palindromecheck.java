import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class palindromecheck {
    public static boolean isPalindrome(int x) {
     int rev=0;
     int rem=0;
     int y=x;
     while(x>0)
     {
        rem=x%10;
        rev=rev*10+rem;
        x=x/10;
     }   
     if(y==rev)
     {
        return true;
     }
     else return false;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
