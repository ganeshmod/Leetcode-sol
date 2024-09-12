class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
       Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
      LinkedList<int[]>ans=new LinkedList<>();
      int count=0;
      for(int[]inter:intervals){
        if(ans.isEmpty()|| ans.getLast()[1]<=inter[0]){
            ans.add(inter);
        }
        else{
       ans.getLast()[1]=Math.min(ans.getLast()[1],inter[1]);
       count++;}
      } 
      return count;
    }
}