/**
 * Given an array of characters chars, compress it using the following algorithm:
 * 
 * Begin with an empty string s. For each group of consecutive repeating characters in chars:
 * 
 * 1. If the group's length is 1, append the character to s.
 * 2. Otherwise, append the character followed by the group's length.
 * 
 * The compressed string s should not be returned separately, but instead, be stored 
 * in the input character array chars. Note that group lengths that are 10 or longer 
 * will be split into multiple characters in chars.
 * 
 * After you are done modifying the input array, return the new length of the array.
 * 
 * You must write an algorithm that uses only constant extra space.
 * 
 * Examples:
 * 
 * Example 1:
 * Input: chars = ["a","a","b","b","c","c","c"]
 * Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
 * Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
 * 
 * Example 2:
 * Input: chars = ["a"]
 * Output: Return 1, and the first character of the input array should be: ["a"]
 * Explanation: The only group is "a", which remains uncompressed since it's a single character.
 * 
 * Example 3:
 * Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
 * Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
 */

class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        char[] chars = {'a', 'b', 'c', 'c'};
        System.out.println(sol.compress(chars));
    }

    public int compress(char[] chars) {
        // 'i' is the start index of the current group of identical characters.
        int i = 0, write_ptr = 0;
    
        // Process groups of repeating characters until we reach the end of the array.
        while (i < chars.length) {
            // Initially, the group length is at least 1 (the character at 'i' itself).
            int groupLength = 1;
            
            // Increase groupLength while the next character is the same as chars[i]
            // and we haven't reached the end of the array.
            while (i + groupLength < chars.length && chars[i + groupLength] == chars[i]) {
                groupLength++;
            }
            
            // Write the character for the current group to the array, then move the write pointer.
            chars[write_ptr++] = chars[i];
            
            // If the group length > 1, write each digit of the group length to the array.
            if (groupLength > 1) {
                for (char c : Integer.toString(groupLength).toCharArray()) {
                    chars[write_ptr++] = c;
                }
            }
            
            // Move 'i' to the start index of the next group
            // While loop breaks after the final group
            i += groupLength;
        }
        
        // 'write_ptr' indicates the length of the compressed string.
        return write_ptr;
    }
}

// Time complexity: O(n)

// Runtime  1ms     | Beats 99.60%
// Memory   44.22MB | Beats 37.66%