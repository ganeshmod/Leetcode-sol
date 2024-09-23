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
class Pair {
    TreeNode node;
    int line;
    Pair(TreeNode node, int line) {
        this.node = node;
        this.line = line;
    }
}

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        
        if (root != null) {
            queue.offer(new Pair(root, 0));
        }
        
        while (!queue.isEmpty()) {
            Pair temp = queue.poll();
            TreeNode node = temp.node;
            int line = temp.line;
            
            if (!map.containsKey(line)) {
                map.put(line, node.val);
            }
            
            if (node.right != null) {
                queue.offer(new Pair(node.right, line + 1));
            }
            
            if (node.left != null) { // Add left child
                queue.offer(new Pair(node.left, line + 1));
            }
        }
        
        for (int val : map.values()) {
            ans.add(val);
        }
        
        return ans;
    }
}
