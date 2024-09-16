class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int maxElement = 0;
        int maxLength = 0;
        
        // Find the maximum element in the array
        for (int i = 0; i < n; i++) {
            maxElement = Math.max(maxElement, nums[i]);
        }

        // Sliding window approach to find the longest subarray
        int left = 0;  // Left pointer of the window
        int right = 0;  // Right pointer of the window

        while (right < n) {
            // If nums[right] is equal to the maxElement, continue expanding the window
            if (nums[right] == maxElement) {
                right++;
            } else {
                // Calculate the length of the current valid window
                maxLength = Math.max(maxLength, right - left);
                // Move the left pointer to the right of the current invalid element
                right++;
                left = right;  // Reset the left pointer
            }
        }

        // Final check in case the longest subarray ends at the last element
        maxLength = Math.max(maxLength, right - left);

        return maxLength;
    }
}
