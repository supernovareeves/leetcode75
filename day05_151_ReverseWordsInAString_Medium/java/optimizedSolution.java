class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "a good   example";
        System.out.println(sol.reverseWords(s));
    }

    public String reverseWords(String s) {
        // Step 1: Trim the input string to remove leading and trailing spaces
        s = s.trim();

        // Step 2: Use StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // i and j represent [start:end] (exclusive) of a word
        int i = s.length(), j=s.length();
        boolean isFindSpace = true;

        while (i >= 0) {
            if (i==0) {
                // At the beginning of the string, append the last word
                result.append(s.substring(i, j));
            } else if (isFindSpace && s.charAt(i-1)==' ') {
                // Found a space at [i-1], i.e. s.charAt(i) is start of a word
                result.append(s.substring(i, j) + " ");
                isFindSpace = !isFindSpace;
            } else if (!isFindSpace && s.charAt(i-1)!=' ') {
                /* After appending substring, i--; makes i==' ',
                iterate i to search for character (end of next word) */ 
                // Found a character at [i-1], i.e. end of word, store it with j
                j=i;
                // switch mode to find for start of a word
                isFindSpace = !isFindSpace;
            }
            i--;
        }
        return result.toString();
    }
}

// Time complexity: O(n)

// Runtime  5ms     | Beats 93.40%
// Memory   43.43MB | Beats 42.13%