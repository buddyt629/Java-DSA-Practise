public class q30 {
    public class Node
    {
        int data;
        Node next;
        Node(int data,Node next)
        {
            this.data=data;
            this.next=next;
        }
    }
    public static detectnode(Node head)
    {
     Node slow=head;
     Node fast=head;
     while(fast!=null && fast.next!=null)
     {
        slow=slow.next;
        fast=fast.next.next;
     if(slow==fast)
     {
        return slow;
     }
    }
return null;}
}
