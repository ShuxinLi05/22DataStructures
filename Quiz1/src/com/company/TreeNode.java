package com.company;

public class TreeNode {
    int var;
    TreeNode left; TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.var = val; }
    TreeNode(int val, TreeNode right,TreeNode left) {
        this.var = val;
        this.right = right;
        this.left = left;

    }
}
