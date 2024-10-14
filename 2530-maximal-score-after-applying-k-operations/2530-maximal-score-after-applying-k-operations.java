class Solution {
    public long maxKelements(int[] nums, int k) {
         int n=nums.length;
     PriorityQueue<Integer> max=new PriorityQueue<>(Comparator.reverseOrder());
      long total=0;
   
     for(int i=0;i<n;i++) {
   max.add(nums[i]);
     }
     while(k>0){
       int a=max.peek();
       max.poll();
       total+=a;
       max.add( (int)Math.ceil(a/3.0));
       k--;
     }
     return total;
    }

}