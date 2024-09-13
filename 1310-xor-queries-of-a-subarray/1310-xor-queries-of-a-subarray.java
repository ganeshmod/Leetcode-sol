import java.util.ArrayList;

class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        ArrayList<Integer> ans = new ArrayList<>(); 
        for (int[] inter : queries) {
            int l = inter[0];
            int r = inter[1];
            int a = 0;
            
            // XOR elements in the range [l, r]
            for (int i = l; i <= r; i++) {
                a ^= arr[i];
            }
            
            ans.add(a);
        }
        
        // Convert ArrayList<Integer> to int[]
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        
        return result;
    }
}
