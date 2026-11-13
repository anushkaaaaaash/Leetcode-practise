/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }

        // Search left subtree
        TreeNode left = lowestCommonAncestor(root.left, p, q);

        // Search right subtree
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // Both sides found something
        if (left != null && right != null) {
            return root;
        }

        // Return whichever side is not null
        if (left != null) {
            return left;
        } else {
            return right;
        }
    }
}