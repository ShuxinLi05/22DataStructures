package com.company;

public class SerializeandDeserializeBST {
    public void dfs(TreeNode root, StringBuilder res) {
        if(root == null) {
            res.append("null").append(' ');
            return;
        }
        res.append(root.val).append(' ');
        dfs(root.left, res);
        dfs(root.right, res);
    }

    public String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        dfs(root, res);
        return res.toString();
    }

    int st;
    public TreeNode deserialize(String data) {
        String[] arr = data.split(" ");
        st = 0;
        return build(arr);
    }

    public TreeNode build(String[] arr) {
        if(arr[st].equals("null")) {
            st++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[st]));
        st++;
        root.left = build(arr);
        root.right = build(arr);

        return root;
    }
}
