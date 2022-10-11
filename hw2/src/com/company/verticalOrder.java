package com.company;

import java.util.*;

public class verticalOrder {
    int max = 0;
    int min = 0;

    private void preorder(TreeNode root, HashMap<TreeNode, Integer> map, int index){
        if (root == null) return;
        map.put(root, index);
        max = Math.max(max, index);
        min = Math.min(min, index);
        preorder(root.left, map, index-1);
        preorder(root.right, map, index+1);
    }

    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        HashMap<TreeNode, Integer> map = new HashMap<>();
        preorder(root, map, 0);
        int len = max-min+1;
        for (int i=0; i<len;i++){
            result.add(new ArrayList<>());
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root != null){
            queue.offer(root);
        }
        while (!queue.isEmpty()){
            TreeNode top = queue.poll();
            int index = map.get(top);
            result.get(index-min).add(top.val);
            if (top.left!=null){
                queue.offer(top.left);
            }
            if (top.right!=null){
                queue.offer(top.right);
            }
        }

        return result;


    }
}
