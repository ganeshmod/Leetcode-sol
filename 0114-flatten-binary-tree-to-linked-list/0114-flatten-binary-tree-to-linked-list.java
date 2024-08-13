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
    public void flatten(TreeNode root) {
        while (root != null) {
            if (root.left != null) {
                // Find the rightmost node of the left subtree
                TreeNode curr = root.left;
                while (curr.right != null) {
                    curr = curr.right;
                }

                // Connect the rightmost node of the left subtree to the right subtree
                curr.right = root.right;

                // Move the left subtree to the right
                root.right = root.left;
                root.left = null;
            }

            // Move on to the next node on the right
            root = root.right;
        }
    }
}