class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
      PriorityQueue<Integer>min=new PriorityQueue<>();
      for(int[] inter :intervals){
        int start=inter[0];
        int end=inter[1];

        if(!min.isEmpty() && start>min.peek())
        {
            min.poll();
            min.add(end);
        }
        else{
        min.add(end);
        }
      }
      return min.size();
    }
}