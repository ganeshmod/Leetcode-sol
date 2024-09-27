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
 class  Pair{
    TreeNode node;
    int num;
    Pair(TreeNode node,int num){
        this.node=node;
        this.num=num;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<Pair> queue=new LinkedList<>();
        queue.offer(new Pair(root,0));
        int ans=0;
        while(!queue.isEmpty()){
          int   mini=queue.peek().num;
            int size=queue.size();
            int first=0;
            int last=0;
            for(int i=0;i<size;i++){
                  int currid=queue.peek().num-mini;
                  TreeNode temp=queue.peek().node;
                  queue.poll();
                  if(i==0){
                    first=currid;
                  }
                  if(i==size-1){
                    last=currid;
                  }
                  if(temp.left!=null){
                    queue.offer(new Pair(temp.left,currid*2+1));
                  }
                  if(temp.right!=null){
                    queue.offer(new Pair(temp.right,currid*2+2));
                  }
            }
            ans=Math.max(ans,last-first+1);
        }
        return ans;
    }
}