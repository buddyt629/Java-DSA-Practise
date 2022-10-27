import java.util.Stack;

public class q37
{
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    public void enqueue(int val)
    {
        stack1.push(val);
    }

    public void dequeue()
    {
        if(stack2.isEmpty())
        {
            if(stack1.isEmpty())
            {
                System.out.println("Nothing To Dequeueu");
            }

            else 
            {
                stack2.push(stack1.pop());
            }
        }
        System.out.println(stack1.pop());
    }
    

}