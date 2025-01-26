class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;

        // Outer loop for partitioning at every index
        for (int target = 1; target < nums.length; target++) {
            int sum1 = 0; // Sum of first partition
            int sum2 = 0; // Sum of second partition

            // Calculate sum of first partition (0 to target-1)
            for (int i = 0; i < target; i++) {
                sum1 += nums[i];
            }

            // Calculate sum of second partition (target to end)
            for (int i = target; i < nums.length; i++) {
                sum2 += nums[i];
            }

            // Check if the absolute difference is even
            if (Math.abs(sum1 - sum2) % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
