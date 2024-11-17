class Solution {
    boolean valid(int[] nums,int[][] queries,int mid)
    {
        int[] temp=new int[nums.length+1];
        for (int i = 0; i <mid; i++) {
            int f = queries[i][0]; 
            int s = queries[i][1]; 
            int val=queries[i][2];
            temp[f]+=val;
            if(s+1<temp.length-1)
            temp[s+1]-=val;
        }
        for(int i=1;i<temp.length;i++)
        {
        temp[i]+=temp[i-1];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>temp[i])
            return false;
        }
        return true;
    }
    public int minZeroArray(int[] nums, int[][] queries) {
        int l=0,r=queries.length,ans=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(valid(nums,queries,mid))
            {
                ans=mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
        
    }
}