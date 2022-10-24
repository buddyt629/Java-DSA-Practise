public class q31 {
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
public static Node findCycle(Node head)

    {

       Node fast=head,slow=head;

       while(fast!=null && fast.next!=null)

       {

           fast=fast.next.next;

           slow=slow.next;

           if(fast==slow)

                return slow;

       }

       return null;

    }

    //Function to remove a loop in the linked list.

    public static void removeLoop(Node head){

       Node meet_point=findCycle(head);

       if(meet_point==null)

            return ;

        Node start=head;

        if(meet_point==head)

        {

            while(meet_point.next!=head)

            {

                meet_point=meet_point.next;

            }

            meet_point.next=null;

            return;

        }

        

        while(start.next!=meet_point.next)

        {

            start=start.next;

            meet_point=meet_point.next;

        }

        meet_point.next=null;

    }
}
