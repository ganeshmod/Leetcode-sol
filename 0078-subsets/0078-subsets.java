class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        int subset=1<<n;
        for(int i=0;i<subset;i++){
            List<Integer> list2=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j)) !=0){
                    list2.add(nums[j]);
                }
            }
            ans.add(list2);
        }
        return ans;
    }
}