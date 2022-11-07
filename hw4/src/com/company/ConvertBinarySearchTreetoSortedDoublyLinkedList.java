package com.company;

import java.util.*;

public class ConvertBinarySearchTreetoSortedDoublyLinkedList {
    public Node treeToDoublyList(Node root){
        if(root == null) return null;
        Node dummy = new Node(0), prev = dummy, curr = root;
        Deque<Node> stack = new ArrayDeque<>();
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            prev.right = curr;
            curr.left = prev;
            prev = curr;
            curr = curr.right;
        }
        dummy.right.left = prev;
        prev.right = dummy.right;
        return dummy.right;
    }
}
