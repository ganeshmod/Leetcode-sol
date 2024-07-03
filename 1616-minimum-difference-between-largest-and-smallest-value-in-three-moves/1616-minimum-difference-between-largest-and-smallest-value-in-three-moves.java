class Solution {
    public int minDifference(int[] nums) {
        int n=nums.length;
        if(n<=4){
            return 0;
        }
        int mini =Integer.MAX_VALUE;
         Arrays.sort(nums);
         mini=Math.min(mini,nums[n-4]-nums[0]);
         mini=Math.min(mini,nums[n-1]-nums[3]);
         mini=Math.min(mini,nums[n-2]-nums[2]);
         mini=Math.min(mini,nums[n-3]-nums[1]);
         return mini;
        
    }
}