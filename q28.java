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
public class q28
{
    public static void reverse()
    {
        if(head==null || head.next==null)
        {
            return;
        }
        Node prev=head;
        Node curr=head.next;
        while(curr.next!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            //update
            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;
    }
    public static void main(String[] args) {
        
    }
}