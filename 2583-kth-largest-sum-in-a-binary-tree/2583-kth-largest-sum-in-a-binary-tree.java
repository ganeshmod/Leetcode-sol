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
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> max=new PriorityQueue<>(Comparator.reverseOrder());
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int length=queue.size();
            long sum=0;
            for(int i=0;i<length;i++){
              TreeNode nikal=queue.poll();
              sum+=nikal.val;
              if(nikal.left!=null){
                queue.offer(nikal.left);
              }
              if(nikal.right!=null){
                queue.offer(nikal.right);
              }
            }
            max.add(sum);
        }
         
        if(max.size()<k){
            return -1;
        }
        for(int i=0;i<k-1;i++){
            max.poll();
        }
        return max.peek();
    }
}