package com.company;

public class splitListToParts {
    public int count(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        int count = count(head);
        int div = count/k;
        int mod = count%k;
        int index = 0;
        ListNode[] result = new ListNode[k];
        ListNode curr= head;
        ListNode pre= head;

        while(curr != null) {
            result[index++] = curr;
            int temp = div;
            while (temp-- != 0) {
                pre = curr;
                curr = curr.next;
            }
            if(mod != 0){    // Take one extra node till mod > 0 i.e. ensures that one extra node is added from starting
                pre = curr;
                curr = curr.next;
                mod--;
            }
            pre.next = null;
        }
        return result;
    }
}
