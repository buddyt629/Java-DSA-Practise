import java.util.Stack;

public class balancedparenthesischecker {
    public static boolean check(String str)
    {
        //boolean res=false;
        Stack<Character> stk=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            if(!stk.isEmpty() && i<n)
            {
                if(stk.peek()=='{' && str.charAt(i)=='}' || stk.peek()=='[' && str.charAt(i)==']' ||stk.peek()=='(' && str.charAt(i)==')')
                {
                    stk.pop();
                }
            }
            else if(stk.isEmpty() && i<n)
            {
              stk.push(str.charAt(i));
            }
        }
        if(stk.isEmpty())
        {
         return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        String str="{}{}[]";
        System.out.println(check(str));
    }
}
