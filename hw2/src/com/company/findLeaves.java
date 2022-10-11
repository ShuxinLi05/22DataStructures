package com.company;

import java.util.ArrayList;
import java.util.List;

public class findLeaves {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        while (root != null){
            List<Integer> leaves = new ArrayList<>();
            root = find(root, leaves);
            result.add(leaves);
        }
        return result;
    }

    private TreeNode find(TreeNode root, List<Integer> leaves){
        if(root == null) return root;
        if(root.left == null && root.right == null){
            leaves.add(root.val);
            return null;
        }
        root.left = find(root.left, leaves);
        root.right = find(root.right, leaves);
        return root;
    }
}
