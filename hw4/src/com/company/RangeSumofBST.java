package com.company;

public class RangeSumofBST {
    int result=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return -1;
        if(root.val >=low && root.val<=high) result+= root.val;
        if(root.val>low) rangeSumBST(root.left, low, high);
        if(root.val<high) rangeSumBST(root.right, low, high);
        return result;
    }
}
