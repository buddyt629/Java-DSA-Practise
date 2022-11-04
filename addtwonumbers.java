public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class addtwonumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode node =new ListNode();
    ListNode curr=node;
    int carry=0;
    while(l1.next!=null || l2.next!=null || carry==1)
    {
      int sum=0;
      if(l1!=null)
      {
        sum+=l1.val;
        l1=l1.next;
      }
      if(l2!=null)
      {
        sum+=l2.val;
        l2=l2.next; 
      }
     
      sum+=carry;
      carry=sum/10;
      ListNode ans=new ListNode(sum%10);
       curr.next=ans;
       curr=curr.next;
    }
    return node.next;
    
    }
}
