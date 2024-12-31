class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "the sky is blue";
        System.out.println(sol.reverseWords(s));
    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for (int i=words.length-1; i>=0; i--) {
            sb.append(words[i] + (i==0? "":" "));
        }
        return sb.toString();
    }
}

// Time complexity: O(n)

// Runtime  7ms     | Beats 60.85%
// Memory   43.59MB | Beats 38.85%