class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        vector<bool> ans(nums.size(),0);
        vector<int> res;
        for(int i=0;i<nums.size();i++)
        {
            ans[nums[i]-1]=1;
        }
        for(int i=0;i<ans.size();i++)
        {
            if(ans[i]==0)
            res.push_back(i+1);
        }
        return res;
        
    }
};