class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {0,1,0,3,12};
        sol.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public void moveZeroes(int[] nums) {
        int left = 0; // Tracks the position where the next non-zero should be placed
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                // Swap only if left and right are different
                if (left != right) {
                    nums[left] = nums[right];
                    nums[right] = 0;
                }
                left++;
            }
        }
    }
        
}

// Time complexity: O(n)

// Runtime  2ms     | Beats 85.28%
// Memory   45.67MB | Beats 91.30%