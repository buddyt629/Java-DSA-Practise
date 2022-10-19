public class linkedlist1 {
    public static void main(String[] args) {
        
    }
    public static boolean detectLoop(Node head){
        if(head==null || head.next==null)
        {
            return false;
        }
    Node slow=head;
    Node fast=head.next;
    while(slow!=fast)
    {
        if(fast==null || fast.next==null)
        {
            return false;
        }
        else 
        {
        slow=slow.next;
        fast=fast.next.next;
       }
    
    }
    return true;
    }
}
