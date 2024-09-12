class Solution {
    public int findMinArrowShots(int[][] points) {
        
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]>ans=new LinkedList<>();
        int count=0;
        for(int[]inter:points){
           if(ans.isEmpty()|| ans.getLast()[1]<inter[0]){
            ans.add(inter);
            count++;
           }
           else{
            ans.getLast()[1]=Math.min(ans.getLast()[1],inter[1]);
            ans.getFirst()[0]=Math.max(ans.getFirst()[0],inter[0]);
           }
           

        }
        return count;
        

    }
}