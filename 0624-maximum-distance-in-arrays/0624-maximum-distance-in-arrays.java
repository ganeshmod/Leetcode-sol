class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int maxi=Integer.MIN_VALUE;
       int i=0;
       while(i<arrays.size()-1){
        List<Integer>ans= arrays.get(i);
        int j=i+1;
        while(j<arrays.size()){
         List<Integer>ans2=arrays.get(j);
       maxi=Math.max(maxi,Math.abs(ans.get(0)-ans2.get(ans2.size()-1)));
       j++;
        }
        i++;
       }
       
        return maxi;
       
    }
}