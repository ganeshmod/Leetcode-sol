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
    public List<Integer> preorderTraversal(TreeNode root) {
        
      ArrayList<Integer> ans=new ArrayList<>();
        while(root!=null){
        if(root.left==null){
            ans.add(root.val);
            root=root.right;
        }
        else{
            TreeNode curr=root.left;
            while(curr.right!=null && curr.right!=root){
                curr=curr.right;
            }
            if(curr.right==null){
                 ans.add(root.val);
                curr.right=root;
                root=root.left;
            }
            else{
                curr.right=null;
               
                root=root.right;
            }
        }}
        return ans;
    }
}