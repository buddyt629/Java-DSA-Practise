import javax.sound.midi.MidiChannel;

public class Node
{
   int data;
   Node next;
   public Node(int data,Node next)
   {
      this.data=data;
      this.next=next;
   }
}
public class detectloopinlinkedlist {
    
    public static boolean detectloop(Node head)
    {
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
    public static void main(String[] args) {
        Node head=
        
        System.out.println(detectloop(Node ));
    }
}
