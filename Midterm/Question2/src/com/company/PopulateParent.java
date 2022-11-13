package com.company;

public class PopulateParent <T>{

    public  Node<T> root;

    public void PopulateParent(Node<T> root){
        // time complexity is O(N)
        if (root == null) return;

        if (root.left != null){
            root.left.parent = root;
            PopulateParent(root.left);
        } else if (root.right != null){
            root.right.parent = root;
            PopulateParent(root.right);
        }

    }

}
