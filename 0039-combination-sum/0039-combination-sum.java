class Solution {
    public static void helper(int[] candidates,int target,int n,int i, List<List<Integer>> ans,List<Integer> temp){
        if(i==n||target<0){
            return ;
        }
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        helper(candidates,target,n,i+1,ans,temp);
        temp.add(candidates[i]);
        helper(candidates,target-candidates[i],n,i,ans,temp);

        temp.remove(temp.size()-1);

        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
       helper( candidates,target,n,0,ans,temp);
       return ans;

    }
}