class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int[] mpp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            mpp[i]=0;
        }
        for(int i=0;i<nums.length;i++)
        {
            mpp[nums[i]-1]=1;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(mpp[i]==0)
            ans.add(i+1);
        }
        return ans;

        
    }
}