public class q33 {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    public Node deletenthendnodee(Node head,int n)
    {
        int size=0;
        Node curr=head;
        while(curr!=null)
        {
            curr=curr.next;
            size++;

        }
        int index=size-n;
        int i=0;
        Node prev=head;
        while(i<index)
        {
            prev=prev.next;
            i++; 
        }
        prev.next=prev.next.next;
        return head;
    }
}
