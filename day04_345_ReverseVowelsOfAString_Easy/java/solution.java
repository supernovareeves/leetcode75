class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "IceCreAm";
        System.out.println(sol.reverseVowels(s));
    }

    public String reverseVowels(String s) {
         // i = head ptr, j = tail ptr
         StringBuilder sb = new StringBuilder(s);
         int i = 0, j = s.length()-1;
         char temp=0;
         
         while (i<j) {
             if (isVowel(sb.charAt(i))) {
                 while (!isVowel(sb.charAt(j))) {
                     j--;
                 }
                 // i,j both points to vowel
                 temp=sb.charAt(i);
                 sb.setCharAt(i, sb.charAt(j));
                 sb.setCharAt(j, temp);
                 j--;
             }
             i++;
         }
         return sb.toString();
    }

    private boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(c) != -1;
    }
}

// Time complexity: O(n)

// Runtime  3ms     | Beats 84.96%
// Memory   44.78MB | Beats 84.72%