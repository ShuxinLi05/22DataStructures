package com.company;

public class swapNodes {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        ListNode first = head;
        ListNode second = head;
        for(int i=0; i<k-1;i++){
            curr = curr.next;
            first = curr;
        }
        while(curr.next != null){
            curr=curr.next;
            second=second.next;
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        return head;
    }
}
