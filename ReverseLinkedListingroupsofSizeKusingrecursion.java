class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    public Node reverse(Node head, int k) {
        Node current = head;
        Node next = null;
        Node prev = null;
        int count = 0;

        /* Reverse first k nodes of linked list */
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        /* next is now a pointer to (k+1)th node
           Recursively call for the list starting from current.
           And make rest of the list as next of first node */
        if (next != null)
            head.next = reverse(next, k);

        /* prev is new head of the input list */
        return prev;
    }
}
