  
class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	 s1.push(x);
    }
	
    
  int Pop()

    {

    if(s1.isEmpty())

    {

        return -1;

    }else{

        while(s1.size()!=0)

        {

            s2.push(s1.pop());

        }

        int ans=s2.pop();

        while(s2.size()!=0)

        {

            s1.push(s2.pop());

        }

        return ans;

    }

    }