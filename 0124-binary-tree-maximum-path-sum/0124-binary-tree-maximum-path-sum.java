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
    public int maxPathSum(TreeNode root) {
        int[] maxi = new int[1];  // Use array to pass by reference
        maxi[0] = Integer.MIN_VALUE;
        check(root, maxi);
        return maxi[0];
    }

    public static int check(TreeNode node, int[] maxi) {
        if (node == null) {
            return 0;
        }
        // Handle negative path
        int leftsum = Math.max(0, check(node.left, maxi));
        int rightsum = Math.max(0, check(node.right, maxi));
        maxi[0] = Math.max(maxi[0], leftsum + rightsum + node.val);
        return node.val + Math.max(leftsum, rightsum);
    }
}
