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
    static int maxi;
    public int diameterOfBinaryTree(TreeNode root) {
       maxi=Integer.MIN_VALUE;
       check(root);
       return maxi;
        
    }
    public static int check(TreeNode node){
        if(node ==null){
            return 0;
        }
        int lh=check(node.left);
        int rh=check(node.right);
        maxi=Math.max(maxi,lh+rh);
        return 1+Math.max(lh,rh);
    }
}