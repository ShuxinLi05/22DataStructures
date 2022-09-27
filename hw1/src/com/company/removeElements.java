package com.company;

public class removeElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return head;
        }
        ListNode ln = head;
        while(ln != null) {
            if(ln.next != null && ln.next.val == val) {
                ln.next = ln.next.next;
            } else {
                ln = ln.next;
            }
        }

        if( head.next==null && head.val==val ){
            head=null;
        }else if(head.next!=null && head.val==val ){
            head=head.next;
        }

        return head;
    }
}
