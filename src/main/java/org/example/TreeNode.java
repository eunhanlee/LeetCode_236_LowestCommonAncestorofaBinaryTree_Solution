package org.example;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode getNodeByValue(int value) {
        if (this.val == value) {
            return this;
        }

        TreeNode leftResult = null;
        TreeNode rightResult = null;

        if (this.left != null) {
            leftResult = this.left.getNodeByValue(value);
        }
        if (this.right != null) {
            rightResult = this.right.getNodeByValue(value);
        }

        return leftResult != null ? leftResult : rightResult;
    }
}
