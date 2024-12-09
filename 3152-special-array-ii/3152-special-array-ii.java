class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = queries.length;
        boolean[] arr = new boolean[n];

        for (int k = 0; k < n; k++) {
            int start = queries[k][0];
            int end = queries[k][1];
            boolean isSpecial = true;

            for (int i = start; i < end; i++) {
                if (i + 1 >= nums.length || 
                   !((nums[i] % 2 == 0 && nums[i + 1] % 2 != 0) || 
                     (nums[i] % 2 != 0 && nums[i + 1] % 2 == 0))) {
                    isSpecial = false;
                    break;
                }
            }

            arr[k] = isSpecial;
        }

        return arr;
    }
}
