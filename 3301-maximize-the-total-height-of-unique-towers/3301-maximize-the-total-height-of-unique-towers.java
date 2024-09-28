class Solution {
    public long maximumTotalSum(int[] maxi) {
        int n=maxi.length;
Arrays.sort(maxi);
        long sum=0;
        int mini=Integer.MAX_VALUE;
        
        for(int j=n-1;j>=0;j--){
            mini=Math.min(mini-1,maxi[j]);
            if(mini<=0)return -1;
            sum+=mini;
        }
        return sum;
    }
}