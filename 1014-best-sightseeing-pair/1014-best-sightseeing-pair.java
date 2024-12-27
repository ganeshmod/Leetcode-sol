class Solution {
    public int maxScoreSightseeingPair(int[] values) {
     int n=values.length;
     int maxi=values[0]+0;
     int res=0;
     for(int j=1;j<n;j++ ){
        int x=values[j]-j;
        int y=maxi;
        res=Math.max(res,x+y);
        maxi=Math.max(maxi,values[j]+j);
     }


return res;

    }
}