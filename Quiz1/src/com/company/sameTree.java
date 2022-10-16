package com.company;

public class sameTree {
    public boolean SameTree(TreeNode nodep, TreeNode nodeq){

        if(nodep==null && nodeq==null) return true;
        if(nodep==null || nodeq==null) return false;

        if(nodep.var !=nodeq.var) return false;
        return SameTree(nodep.left, nodeq.left) && SameTree(nodep.right, nodeq.right);

    }

}
