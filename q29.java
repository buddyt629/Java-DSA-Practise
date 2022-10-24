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
Node removeDuplicates(Node head)
    {
        Node temp= head;
        while(head!=null)
        {
	    while(head.next!=null && head.data==head.next.data)
	    head.next=head.next.next;
	    head=head.next;
        }
        return temp;
    }