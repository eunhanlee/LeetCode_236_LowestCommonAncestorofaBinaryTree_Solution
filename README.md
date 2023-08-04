# LeetCode 236. Lowest Common Ancestor of a Binary Tree Java Solution

Hashnode Link: https://eunhanlee.hashnode.dev/leetcode-236-lowest-common-ancestor-of-a-binary-tree-java-solution

Blogger link: https://eunhanspace.blogspot.com/2023/08/leetcode-236-lowest-common-ancestor-of.html

## Problem

[Lowest Common Ancestor of a Binary Tree - LeetCode](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/?envType=featured-list&envId=top-interview-questions)

### Problem Solution

- This problem asks whether you know about the Lowest Common Ancestor (LCA) and if you can implement it.
- In this problem, the preprocessing step for LCA cannot be used because we cannot modify the tree nodes.
- Therefore, the usual LCA algorithm involves comparing from the two target nodes and going up to their common parent. However, in this problem, we traverse from the root down the tree, comparing each node with nodes p and q to find the LCA.

### Reference

[What is LCA(Lowest Common Ancestor)](https://www.notion.so/What-is-LCA-Lowest-Common-Ancestor-7c70ed9e89814ae4a55b0b0cad46e61a?pvs=21) 

## Github Link

[https://github.com/eunhanlee/LeetCode_236_LowestCommonAncestorofaBinaryTree_Solution.git](https://github.com/eunhanlee/LeetCode_236_LowestCommonAncestorofaBinaryTree_Solution.git)

## Time Complexity: O(n), Space Complexity: O(n)

n = depth of the binary tree

```java
public class Solution {
    /**
     * Find the lowest common ancestor of two nodes in a binary tree.
     *
     * @param root The root node of the binary tree.
     * @param p    The first node.
     * @param q    The second node.
     * @return The lowest common ancestor of nodes p and q.
     */
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // If the root is null or either p or q is the root, return the root.
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recursively find the lowest common ancestor in the left and right subtrees.
        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);

        // If both leftLCA and rightLCA are not null, it means p and q are in different subtrees, and the current root is the lowest common ancestor.
        if (leftLCA != null && rightLCA != null) {
            return root;
        }
        // If leftLCA is not null, it means p and q are in the left subtree, and the lowest common ancestor is in the left subtree.
        else if (leftLCA != null) {
            return leftLCA;
        }
        // If rightLCA is not null, it means p and q are in the right subtree, and the lowest common ancestor is in the right subtree.
        else {
            return rightLCA;
        }
    }
}
```

## Code Sequence Example

```
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
```

![Untitled](https://github.com/eunhanlee/LeetCode_236_LowestCommonAncestorofaBinaryTree_Solution/blob/7ed10d4ca255aeae7eacaaaaab72c7e042cc9b37/photos/Untitled.png)

![Untitled](https://github.com/eunhanlee/LeetCode_236_LowestCommonAncestorofaBinaryTree_Solution/blob/dabc55cb65c4f8cf13af68d89d526e02b4e1a99e/photos/Untitled%201.png)

![Untitled](https://github.com/eunhanlee/LeetCode_236_LowestCommonAncestorofaBinaryTree_Solution/blob/dabc55cb65c4f8cf13af68d89d526e02b4e1a99e/photos/Untitled%202.png)

![Untitled](https://github.com/eunhanlee/LeetCode_236_LowestCommonAncestorofaBinaryTree_Solution/blob/dabc55cb65c4f8cf13af68d89d526e02b4e1a99e/photos/Untitled%203.png)

![Untitled](https://github.com/eunhanlee/LeetCode_236_LowestCommonAncestorofaBinaryTree_Solution/blob/dabc55cb65c4f8cf13af68d89d526e02b4e1a99e/photos/Untitled%204.png)

![Untitled](https://github.com/eunhanlee/LeetCode_236_LowestCommonAncestorofaBinaryTree_Solution/blob/dabc55cb65c4f8cf13af68d89d526e02b4e1a99e/photos/Untitled%205.png)

![Untitled](https://github.com/eunhanlee/LeetCode_236_LowestCommonAncestorofaBinaryTree_Solution/blob/dabc55cb65c4f8cf13af68d89d526e02b4e1a99e/photos/Untitled%206.png)

![Untitled](https://github.com/eunhanlee/LeetCode_236_LowestCommonAncestorofaBinaryTree_Solution/blob/dabc55cb65c4f8cf13af68d89d526e02b4e1a99e/photos/Untitled%207.png)

![Untitled](https://github.com/eunhanlee/LeetCode_236_LowestCommonAncestorofaBinaryTree_Solution/blob/dabc55cb65c4f8cf13af68d89d526e02b4e1a99e/photos/Untitled%208.png)

![Untitled](https://github.com/eunhanlee/LeetCode_236_LowestCommonAncestorofaBinaryTree_Solution/blob/dabc55cb65c4f8cf13af68d89d526e02b4e1a99e/photos/Untitled%209.png)

![Untitled](https://github.com/eunhanlee/LeetCode_236_LowestCommonAncestorofaBinaryTree_Solution/blob/dabc55cb65c4f8cf13af68d89d526e02b4e1a99e/photos/Untitled%2010.png)
