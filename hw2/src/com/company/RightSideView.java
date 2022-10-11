package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        bfs(root, result);
        return result;
    }

    public void bfs(TreeNode root, List<Integer> result){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = q.size();
        int i = 0;
        while (q.size()!=0){
            TreeNode node = q.remove();
            int data = node.val;
            if (node.left != null){
                q.add(node.left);
            }
            if (node.right != null){
                q.add(node.right);
            }
            i++;
            if (i==level){
                result.add(data);
                level= q.size();
                i=0;
            }
        }

    }
}
