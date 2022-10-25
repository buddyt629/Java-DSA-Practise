import java.util.LinkedList;

public class q32 {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    Node sortedMerge(Node head1, Node head2) {
        LinkedList res=new LinkedList<>();
        while(head1.next!=null && head2.next!=null)
        {
             if(head1.data<head2.data)
             {
                res.add(head1.data);
                head1=head1.next;
             }
             else {
                res.add(head2.data);
                head2=head2.next;
             }
        }
        while(head1.next!=null)
        {
            res.add(head1.data);
            head1=head1.next;
        }
        while(head2.next!=null)
        {
            res.add(head2.data);
            head2=head2.next;
        }
        return res;
      } 
      public static void main(String[] args) {
        
      }
}
