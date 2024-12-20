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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        rightview(root,ans,0);
        return ans;
    }
    public void rightview(TreeNode curr,List<Integer>ans,int level){
        if(curr==null){
            return;
        }
        if(level==ans.size()){
            ans.add(curr.val);
        }
        rightview(curr.right,ans,level+1);
           rightview(curr.left,ans,level+1);
    }
}