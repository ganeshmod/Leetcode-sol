class Solution {
    public int rob(int[] nums) {
        
      if(nums==null|| nums.length==0){
        return 0;
      }
      if(nums.length==1){
        return nums[0];
      }
      int[] arr=new int[nums.length];
      arr[0]=nums[0];
      arr[1]=Math.max(nums[0],nums[1]);
      for(int i=2;i<arr.length;i++){
        arr[i]=Math.max(arr[i-1],nums[i]+arr[i-2]);
      }
      return arr[n-1];
    }
}