class Solution {
public:
static bool comp(vector<int> &num1,vector<int> &num2)
{
    return num1[0]<num2[0];
}
    vector<vector<int>> merge(vector<vector<int>>& intr) {
        vector<vector<int>> ans;
        sort(intr.begin(),intr.end(),comp);
        int initial=intr[0][0];
        int final=intr[0][1];
        for(int i=1;i<intr.size();i++)
        {
            if(final>=intr[i][0])
            {
               final=max(final,intr[i][1]);
            }
            else
            {
                ans.push_back({initial,final});
                initial=intr[i][0];
                final=max(final,intr[i][1]);
            }
        }
        ans.push_back({initial,final});
        return ans;

        
    }
};