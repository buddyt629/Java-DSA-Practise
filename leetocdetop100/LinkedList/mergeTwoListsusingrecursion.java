
//My second solution is to use recursion. Personally, I don't like this approach. Because in real life, the length of a linked list could be much longer than we expected, in which case the recursive approach is likely to introduce a stack overflow. (Imagine a file system)

//But anyway, as long as we communicate this concerning properly with the interviewer, I don't think it's a big deal here.

class mergeTwoListsusingrecursion {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
}
}