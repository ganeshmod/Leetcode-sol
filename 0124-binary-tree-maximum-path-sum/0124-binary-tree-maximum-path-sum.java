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
    static int maxi=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        // Use array to pass by reference
        
        check(root);
        return maxi;
    }

    public static int check(TreeNode node) {
        if (node == null) {
            return 0;
        }
        // Handle negative path
        int leftsum = Math.max(0, check(node.left));
        int rightsum = Math.max(0, check(node.right));
        maxi = Math.max(maxi, leftsum + rightsum + node.val);
        return node.val + Math.max(leftsum, rightsum);
    }
}
