import java.util.Stack;

class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(!stk.isEmpty() && i<s.length()){
            if(stk.peek()=='(' && s.charAt(i)==')' || stk.peek()=='{' && s.charAt(i)=='}' || stk.peek()=='[' && s.charAt(i)==']' )
            {
               stk.pop();
            }
            else stk.push(s.charAt(i));
             }
          
             else if(stk.isEmpty() && i<s.length())
            {
                stk.push(s.charAt(i));
            }


        }
        if(stk.isEmpty())
        {
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        String str="()[]{";
        System.out.println(isValid(str));
    }
}