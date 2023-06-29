package org.example;


public class Solution {
    /**
     * Finds the lowest common ancestor of two nodes in a binary tree.
     *
     * @param root The root of the binary tree.
     * @param p    The first node.
     * @param q    The second node.
     * @return The lowest common ancestor of nodes p and q.
     */
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // If root is null or either p or q is the root, return the root
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recursively find the lowest common ancestor in the left and right subtrees
        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);

        // If both leftLCA and rightLCA are not null, it means p and q are found in different subtrees,
        // so the current root is the lowest common ancestor
        if (leftLCA != null && rightLCA != null) {
            return root;
        }
        // If leftLCA is not null, it means both p and q are found in the left subtree,
        // so the lowest common ancestor is in the left subtree
        else if (leftLCA != null) {
            return leftLCA;
        }
        // If rightLCA is not null, it means both p and q are found in the right subtree,
        // so the lowest common ancestor is in the right subtree
        else {
            return rightLCA;
        }
    }
}
