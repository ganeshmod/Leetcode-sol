class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int res=nums[i];
           
            int need=target-res;
            if(mpp.containsKey(need)){
                return new int[]{mpp.get(need),i};
            }
             mpp.put(res,i);

        }
        return new int[]{-1,-1};

        
    }
}