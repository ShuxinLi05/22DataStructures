package com.company;
import java.util.*;
public class RecoverBinarySearchTree {
    public void recoverTree(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        boolean firstTime = true;
        TreeNode m = null, n = null, pre = null;
        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (stack.isEmpty()) {
                break;
            }
            TreeNode node = stack.pop();
            if (pre != null && pre.val > node.val) {
                if (firstTime) {
                    m = pre;
                    firstTime = false;
                }
                n = node;
            }
            pre = node;
            root = node.right;
        }
        int tmp = m.val;
        m.val = n.val;
        n.val = tmp;

    }

}
