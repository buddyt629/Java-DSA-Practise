public class q36
{
    //Function to check if brackets are balanced or not.
    public static boolean ispar(String x)

    {
        Stack <Character> stack= new Stack<>();

        for(int i=0;i<x.length();i++){

        if(!stack.isEmpty() && i<x.length()){

            if(stack.peek()=='[' && x.charAt(i)==']'||stack.peek()=='(' && x.charAt(i)==')'

            ||stack.peek()=='{' && x.charAt(i)=='}')

                stack.pop();

            else 

                stack.push(x.charAt(i));

        }

        else if(stack.isEmpty() && i<x.length())

            stack.push(x.charAt(i));
          

    } 

        if (stack.isEmpty())
    
                    return true;

    return false;

    }
}
