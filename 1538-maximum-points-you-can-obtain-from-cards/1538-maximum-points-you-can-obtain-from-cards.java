class Solution {
    public int maxScore(int[] cardPoints, int k) {
         int lsum=0;
        int rsum=0;
        int maxsum=0;
        for(int i=0; i<k ;i++){
            lsum=lsum+cardPoints[i];
            maxsum=lsum;
            
        }
     int    rindex=cardPoints.length-1;
        for(int j=k-1;j>=0;j--){
            lsum=lsum-cardPoints[j];
            rsum=rsum+cardPoints[rindex];
            rindex=rindex-1;
            maxsum=Math.max(lsum+rsum,maxsum);
        }
        return maxsum;
        
    }
}