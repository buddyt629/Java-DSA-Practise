 public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
public class removenthnodefromlinkedlist {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int index=n-k;
        int k=0;
        while(k<index);
        {
          temp=temp.next;
          k++;
        }
        temp.next=temp.next.next;
        return head;
    }
}
