public static class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
public class linkedlist3 {
    public static int taill(Node head)
    {
        Node slow=head;
        Node fast=head;
        int j=0;
        while(j<n && fast!=null)
        {
            fast=fast.next;
            j++;
        }
        if(j<n && fast==null){
            return -1;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;

        }
        return slow.data;

    }
    public static void main(String[] args) {
       Node node=new Node();
       node.data(1);
       node.data(11);
       node.data(21);
       node.data(14);
       node.data(61);
       node.data(17);

        taill(null);
    }
}
