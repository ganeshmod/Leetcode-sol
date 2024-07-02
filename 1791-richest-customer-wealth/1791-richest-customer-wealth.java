class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int curr=0;
            for(int j=0;j<accounts[i].length;j++){
                curr=curr+accounts[i][j];
            }
            if(curr>maxi){
                maxi=curr;
            }
        }

        return maxi;
    }
}