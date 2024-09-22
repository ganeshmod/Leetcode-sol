class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        boolean flag = true;  // true means left-to-right, false means right-to-left
        
        while (!qu.isEmpty()) {
            int size = qu.size();
            List<Integer> list = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                TreeNode node = qu.poll();
                
                if (flag) {
                    list.add(node.val);  // Add elements from left to right
                } else {
                    list.add(0, node.val);  // Add elements from right to left
                }

                if (node.left != null) {
                    qu.add(node.left);
                }
                if (node.right != null) {
                    qu.add(node.right);
                }
            }
            
            flag = !flag;  // Toggle the direction for the next level
            ans.add(list);
        }
        
        return ans;
    }
}