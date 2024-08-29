class Solution {
    public static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int var = nums[start];
            nums[start] = nums[end];
            nums[end] = var;
            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int counter = -1;

        // Step 1: Find the rightmost element which is smaller than the next element
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                counter = i - 1;
                break;
            }
        }

        if (counter != -1) {
            // Step 2: Find the element to swap with
            int swap_index = counter;
            for (int j = n - 1; j > counter; j--) {
                if (nums[j] > nums[counter]) {
                    swap_index = j;
                    break;
                }
            }

            // Swap the elements
            int temp = nums[counter];
            nums[counter] = nums[swap_index];
            nums[swap_index] = temp;

            // Reverse the elements to the right of the counter
            reverse(nums, counter + 1, n - 1);
        } else {
            // If no valid permutation is found, reverse the whole array
            reverse(nums, 0, n - 1);
        }

        // Output the array for debugging purposes
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
