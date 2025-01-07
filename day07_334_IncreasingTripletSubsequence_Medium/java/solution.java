/**
 * 334. Increasing Triplet Subsequence
 * Medium
 *
 * Given an integer array nums, return true if there exists a triple of indices 
 * (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. 
 * If no such indices exist, return false.
 *
 * Example 1:
 * Input: nums = [1,2,3,4,5]
 * Output: true
 * Explanation: Any triplet where i < j < k is valid.
 *
 * Example 2:
 * Input: nums = [5,4,3,2,1]
 * Output: false
 * Explanation: No triplet exists.
 *
 * Example 3:
 * Input: nums = [2,1,5,0,4,6]
 * Output: true
 * Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
 * 
 */

 class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2,1,5,0,4,6};
        System.out.println(sol.increasingTriplet(nums));
    }
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) return false;
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        // Traverse the array
        for (int num : nums) {
            if (num <= first) {
                // first == the smallest value encountered so far
                first = num;
            } else if (num <= second) {
                // second == the second smallest value encountered so far (SECOND > first)
                second = num;
            } else {
                // found a value bigger than both 'first' and 'second', existence of an increasing triplet.
                System.gc();
                return true;
            }
        }
        return false;
    }
}


/**
 * Note:
 * Sometimes i > j (first_idx > second_idx),
 * but the existence of second means we found a value smaller than second in earlier traversal
 * 
 * In Java, System.gc() is a method call that suggests (or “requests”) that 
 * the Java Virtual Machine (JVM) make its best effort to run the garbage collector (GC). 
 * 
 * System.gc() in real-world production code is almost never recommended as a genuine performance or memory-optimization tactic
 * */ 


// Time complexity: O(n)

// Runtime  2ms     | Beats 94.56%
// Memory   95.09MB | Beats 99.94%