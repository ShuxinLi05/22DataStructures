package com.company;

public class BinTree <T>{
    public Node<T> root;

    public BinTree() {}

    public Node populateNextLeft(Node root) {
        // Time complexity is O(N)

        if(root == null) return root;

        Node cur = root;

        while(cur != null){
            Node head = cur;
            while(cur != null){
                if(cur.right != null){
                    cur.right.nextRight = cur.left;
                }

                if(cur.left != null && cur.nextRight != null){
                    cur.left.nextRight = cur.nextRight.left;
                }
                cur = cur.nextRight;
            }
            cur = head.left;
        }

        return root;
    }
}
