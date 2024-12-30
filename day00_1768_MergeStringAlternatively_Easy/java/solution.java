class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String word1 = "abc";
        String word2 = "pqrs";
        System.out.println(sol.mergeAlternately(word1, word2));
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int i=0, m=word1.length(), n=word2.length(), minLength = Math.min(m, n);
        while (i<minLength) {
            if (i<m) { result.append(word1.charAt(i)); }
            if (i<n) { result.append(word2.charAt(i)); }
            i++;
        }
        result.append(word1.substring(i, m));
        result.append(word2.substring(i, n));

        return result.toString();
    }
}

// Time complexity: O(m+n)

// Runtime  0ms     | Beats 100.00%
// Memory   41.82MB | Beats 50.17%