class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int sum = nums[0];
        int maxi = sum;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];  // Continue adding to the sum in an ascending subarray
            } else {
                sum = nums[i];   // Start a new sum from the current number
            }
            maxi = Math.max(maxi, sum); // Update the maximum sum
        }

        return maxi;
    }
}
