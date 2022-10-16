package com.company;
import java.util.*;

public class LevelOrderTraversal {
    public class levelOrder {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if(root == null) return res;

            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);

            while(!q.isEmpty()){
                int size = q.size();
                List<Integer> list = new ArrayList<>();
                for(int i = 0; i<size;i++){
                    TreeNode node = q.remove();
                    list.add(node.var);
                    if(node.left!=null){
                        q.add(node.left);
                    }
                    if(node.right!=null){
                        q.add(node.right);
                    }
                }
                res.add(list);
            }
            return res;
        }
    }

}
