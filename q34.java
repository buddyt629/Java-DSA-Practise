
//IMPLEMENTING STACK USING ARRAYS
public class q34 {
    int a[];
    int top;
    int capacity;
   public q34(int capacity)
   {
    capacity=this.capacity;
    top=-1;
    a=new int[capacity];
   }

   //PUSH METHOD TO ADD
   public void push(int data)
   {
    if(top==capacity-1)
    {
        throw new Exception("Overflow");
    }
    top++;
    a[top]=data;
   }
   // POP  METHOD TO REMOVE FROM STACK
   public int pop()
   {
    if(top=-1)
    {
        throw new Exception("Underflow");
    }
    int res=a[top];
     top--;
     return res;
   }
   //PEEK METHOD TO RETYRN THE VALUE OF TOPS
   public int peek()
   {
    if(top=-1)
    {
        throw new Exception("empty stack");
    }
    res=a[top];
    return res;
   }

}
