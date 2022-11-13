package com.company;

public class Main {

    public static void main(String[] args) {

        //rotate list test
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        rotateRight ls1 = new rotateRight();
        printList(ls1.rotateRight(head,7));

        //remove elements test
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        head1.next.next.next.next.next = new ListNode(6);
        removeElements ls2 = new removeElements();
        printList(ls2.removeElements(head1,4));

        //swap nodes test
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(6);
        swapNodes ls3 = new swapNodes();
        printList(ls3.swapNodes(head2,4));

        //split list test
        Node head3 = new Node(1);
        head3.next = new Node(2);
        head3.next.next = new Node(4);
        head3.next.next.next = new Node(4);
        head3.next.next.next.next = new Node(5);
        head3.next.next.next.next.next = new Node(6);
        insert ls4 = new insert();
        //printList(ls4.insert(head3,3));

    }

    public static void printList(ListNode head){
        if(head == null){
            System.out.println("List is empty");
        }
        ListNode temp = head;
        //complexity is O(n)
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void printList(Node head){
        if(head == null){
            System.out.println("List is empty");
        }
        Node temp = head;
        //complexity is O(n)
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
