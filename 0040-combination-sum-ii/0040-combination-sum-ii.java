class Solution {
   public static void helper(int[] candidates, int index, List<List<Integer>> ans, List<Integer> temp, int target) {
    if (target == 0) {
        ans.add(new ArrayList<>(temp));
        return;
    }
    
    if (target < 0 || index >= candidates.length) {
        return;
    }
    
    for (int i = index; i < candidates.length; i++) {
        // Check if the current candidate exceeds the remaining target
       
        
        // Skip duplicates to avoid redundant combinations
        if (i > index && candidates[i] == candidates[i - 1]) {
            continue;
        }
        
        temp.add(candidates[i]); // Add current candidate to the combination
        helper(candidates, i + 1, ans, temp, target - candidates[i]); // Recurse with the next index
        temp.remove(temp.size() - 1); // Backtrack: remove the last added element
    }
}

public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    Arrays.sort(candidates); // Sort the candidates array before processing
    helper(candidates, 0, ans, temp, target);
    return ans;
}

}