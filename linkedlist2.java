public class linkedlist2 {
    public static void main(String[] args) {
        
    }
    public static boolean detectLoop(Node head){
        if(head==null || head.next==null)
        {
            return false;
        }
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
}
