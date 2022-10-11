package com.company;

import java.util.Stack;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();
        leftStack.push(root.left);
        rightStack.push(root.right);

        while (leftStack.size() > 0 && rightStack.size() > 0) {
            TreeNode t1 = leftStack.pop();
            TreeNode t2 = rightStack.pop();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            leftStack.push(t1.right);
            leftStack.push(t1.left);
            rightStack.push(t2.left);
            rightStack.push(t2.right);
        }
        return leftStack.size() == 0 && rightStack.size() == 0;
    }
}
