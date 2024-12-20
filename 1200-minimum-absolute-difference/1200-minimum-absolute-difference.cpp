class Solution {
public:
    vector<vector<int>> minimumAbsDifference(vector<int>& arr) {
        vector<vector<int>> ans;
        sort(arr.begin(),arr.end());
        unordered_set<int> st;
        int req=arr[1]-arr[0];
        st.insert(arr[0]);
        int n=arr.size();
        for(int i=1;i<n;i++)
        {
            st.insert(arr[i]);
            req=min(arr[i]-arr[i-1],req);
        }
        for(int i=0;i<n;i++)
        {
            int num=arr[i];
            int need=num+req;
            if(st.find(need)!=st.end())
            {
                ans.push_back({num,need});
            }
            
        }
        return ans;
        
    }
};