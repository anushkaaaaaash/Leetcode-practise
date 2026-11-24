/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // If main tree is empty
        if (root == null) {
            return false;
        }

        // Check whether trees starting here are identical
        if (isSameTree(root, subRoot)) {
            return true;
        }

        // Search in left and right subtrees
        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Both nodes are null
        if (p == null && q == null) {
            return true;
        }

        // Only one node is null
        if (p == null || q == null) {
            return false;
        }

        // Values don't match
        if (p.val != q.val) {
            return false;
        }

        // Compare both left and right children
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}
