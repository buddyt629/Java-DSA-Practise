public class nthnodelinkedlist {
    public static int nthnode(Node head)
    {
        Node slow=head;
        Node fast=head;
     int j=0;
        while(j<n && fast!=null)
        {
            fast=fast.next;
            j++;
        }
        if(fast.next==null)
        {
            return -1;
        }
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        
    }
}
