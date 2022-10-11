import java.util.Stack;

public class string11
{
    public static boolean ispar(String exp)
    {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            if(!stack.isEmpty() && i<exp.length())
            {
                if(stack.peek()=='[' && exp.charAt(i)==']' || stack.peek()=='{' && exp.charAt(i)=='}'||stack.peek()=='(' && exp.charAt(i)==')')
                {
                    stack.pop();

                }
                else stack.push(exp.charAt(i));
            }
            else if(stack.isEmpty()&&i<exp.length())
            {
                stack.push(exp.charAt(i));
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        String exp="{([]}";
        System.out.println(ispar(exp));
    }
}