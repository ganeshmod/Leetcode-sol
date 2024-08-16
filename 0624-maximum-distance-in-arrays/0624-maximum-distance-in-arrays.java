class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int result=0;
        List<Integer>ans1=arrays.get(0);
        int MIN=ans1.get(0);
        int MAX=ans1.get(ans1.size()-1);
        for(int i=1;i<arrays.size();i++){
            List<Integer>ans2=arrays.get(i);
            int currmin=ans2.get(0);
            int currmax=ans2.get(ans2.size()-1);
            result = Math.max(result, Math.abs(MIN - currmax));
            result = Math.max(result, Math.abs(currmin - MAX));

            MAX=Math.max(MAX,currmax);
            MIN=Math.min(MIN,currmin);
        }
return result;
       
    }
}