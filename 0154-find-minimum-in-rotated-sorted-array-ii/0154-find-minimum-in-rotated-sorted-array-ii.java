class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int n=nums.length;
        int high=n-1;
           
          if(nums[low]<nums[high]){
            return nums[low];
        }
        else{

        
        while(low<=high){
            int mid=low+(high-low)/2;
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            if(nums[mid]<=nums[next] && nums[mid]<=nums[prev]){
                return nums[mid];
            }
            else if( nums[low]<=nums[mid]){
                low=mid+1;
            }
            else if(nums[mid]<=nums[high]){
                high=mid-1;
            }
        }
        return -1;}
        
    }
}