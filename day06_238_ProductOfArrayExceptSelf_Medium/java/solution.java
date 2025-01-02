/**
 * 238. Product of Array Except Self
 * 
 * Prefix Postfix approach
 * 
 * Example [1,2,3,4]
 * Prefix: ->
 * |       1       |   1*2   | 1*2*3 | 1*2*3*4 |
 * 
 * Postfix:
 * |    1*2*3*4    |  2*3*4  |  3*4  |    4    |
 * 
 * Result (Multiply without the symbol in own position 
 *  == leftValue from prefix * rightValue from postfix)
 * |     2*3*4     |  1*3*4  | 1*2*4 |  1*2*3  |
 * Output: [24,12,8,6]
 */

class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-1,1,0,-3,3};
        System.out.println(sol.productExceptSelf(nums));
    }
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        // iterate nums, calculate prefix for i element and store at output[i]
        output[0] = nums[0];    // Prefix for 1st element == self
        for (int i=1; i<nums.length; i++) {
            output[i] = output[i-1]*nums[i];
        }
        int tempPostfix = 1;    // Postfix for last element == 1
        for (int i=output.length-1; i>0; i--) {
            output[i] = output[i-1] * tempPostfix;
            tempPostfix = tempPostfix * nums[i];
        }
        output[0] = tempPostfix;
        return output;
    }
}


// Time complexity: O(n)

// Runtime  2ms     | Beats 89.31%
// Memory   55.60MB | Beats 47.71%