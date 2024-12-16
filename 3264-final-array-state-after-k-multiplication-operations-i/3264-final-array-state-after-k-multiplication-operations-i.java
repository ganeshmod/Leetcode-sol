class Solution {
    public static int search(int[] nums,int var){
        for(int j=0;j<nums.length;j++){
            if(nums[j]==var){
                return j;
            }
        }
        return -1;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Integer> min=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            min.add(nums[i]);

        }
        while(k>0){
            Integer var=min.peek();
             min.poll();
             int index=search(nums,var);
             var*=multiplier;
             nums[index]=var;
             min.add(var);
           k--;
        }


return nums;
        }
}