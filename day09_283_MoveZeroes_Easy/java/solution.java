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
        int i=0;
        for (int num : nums) {
            if (num!=0) {
                nums[i] = num;
                i++;
            }
        }
        while (i<nums.length) {
            nums[i] = 0;
            i++;
        }
    }   
}

// Time complexity: O(n)

// Runtime  1ms     | Beats 99.78%
// Memory   46.21MB | Beats 15.71%