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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        int count=0;
        List<Integer>ans= new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            if(temp.left!=null){
                ans.add(temp.val);
                queue.offer(temp.left);
            } 
             if(temp.right!=null){
                ans.add(temp.val);
                queue.offer(temp.right);
            } 
        }
        return ans.size()+1;
    }
}