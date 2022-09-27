package com.company;

public class rotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0 || head.next == null){
            return head;
        }

        int len = 1;
        ListNode ln = head;
        while(ln.next != null){
            ln = ln.next;
            len++;
        }

        ln.next = head;

        int rotate = k%len;
        int skip = len-rotate;
        ListNode newHead = head;
        while(skip-- >1){
            newHead = newHead.next;
        }

        head = newHead.next;
        newHead.next = null;

        return head;

    }
}
