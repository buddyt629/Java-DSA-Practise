
//NODE CLASS FOR LINKED LIST
public class Node{
    int data;
    Node next;
    public Node(int data,Node next)
    {
        data=this.data;
        next=this.next;
    }
    public Node(int data)
    {
        data=this.data;
    }
}
//STACK IMPLEMENTATION USING LINKED LIST 
public class q35 {
    Node head;
    int size;
    public q35()
    {
      head=null;
      size=0;
    }
    //PUSH METHOD FOR ADDING ELEMETNS
   public void push()
   {
    Node temp=new Node(data);
    temp.next=head;
    size++;
    temp=head;
   }
   //POP METHOD FOR DELETING ELEMENTS FROM STACK
   public int pop()
   {
    if(head==null)
    {
        throw new Exception("Stack Empty");
    }
    int res=head.data;
    head=head.next;
    size--;
    return res;
   }
   //IT RETURNS THE TPOPMOST VALUE PRESENT IN STACK
   public int peek()
   {
    if(head==null)
    {
        throw new Exception("Stack Empty");
    }
    return head.data;
   }



}

