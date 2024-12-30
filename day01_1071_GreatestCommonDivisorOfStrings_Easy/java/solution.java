class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(sol.gcdOfStrings(str1, str2));
    }
    public String gcdOfStrings(String str1, String str2) {
        if ((str1+str2).equals(str2+str1)) {
            return str1.substring(0,gcd(str1.length(), str2.length()));
        } else {
            return "";
        }
    }

    private int gcd(int a, int b) {
        // Euclidean's Algorithm
        if (b==0) { return a; }
        else { return gcd(b,a%b); }
    }
}

// Time complexity: O(m+n)

// Runtime  1ms     | Beats 69.13%
// Memory   42.10MB | Beats 64.13%