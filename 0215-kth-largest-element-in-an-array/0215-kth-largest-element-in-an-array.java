class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>mini=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            mini.add(nums[i]);
            if(mini.size()>k){
                mini.poll();
            }
        }
        int a=mini.peek();
        mini.poll();
        return a;
    }
}