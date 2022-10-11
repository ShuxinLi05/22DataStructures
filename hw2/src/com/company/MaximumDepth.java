package com.company;

import java.util.Stack;

public class MaximumDepth {
    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        int max = 0;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> count = new Stack<>();
        stack.push(root);
        count.push(1);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            int temp = count.pop();
            max = Math.max(temp, max);
            if(node.left != null){
                stack.push(node.left);
                count.push(temp+1);
            }
            if(node.right != null){
                stack.push(node.right);
                count.push(temp+1);
            }
        }
        return max;

    }
}
