public class linkedlist4 {
    public static void main(String[] args) {
     getMiddle(null);
    }
    public static  int getMiddle(Node head)
        {
     Node slow=head;
     Node fast=head;
     while(fast!=null && fast.next!=null)
     {
        slow=slow.next;
        fast=fast.next.next;
     }
     return slow;
        }
}
