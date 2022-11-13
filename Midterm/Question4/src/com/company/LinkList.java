package com.company;

public class LinkList {
    public Node head;

    //public int length = 0;

    public LinkList() {
        head = null;
    }
    public Node insert(Integer data, Node root){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            newNode.next = head;
            return head;
        }

        if (head.next == null){
            if (head.data < newNode.data){
                head.next = newNode;
                newNode.next = head;
                return head;
            } else {
                newNode.next = head;
                head.next = newNode;
                return head;
            }
        }
        Node cur = head;
        while (cur.next != head){
            if (cur.data <= newNode.data && newNode.data <= cur.next.data){
                break;
            } else if (cur.data > cur.next.data){
                if (cur.next.data >= newNode.data || cur.data <= newNode.data){
                    break;
                }
            }
            cur = cur.next;
        }
        Node curNode = cur.next;
        cur.next = newNode;
        newNode.next = curNode;
        return head;



    }
}
