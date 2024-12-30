package day02_1431_KidsWithTheGreatestNumberOfCandies_Easy.java;
import java.util.ArrayList;
import java.util.List;


class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(sol.kidsWithCandies(candies, extraCandies));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>(candies.length);
        
        int max = candies[0];
        for (int i : candies) {
            if (i>max) max=i;
        }

        for (int i=0; i<candies.length; i++) {
            result.add((candies[i]+extraCandies) >= max);
        }
        return result;
    }
}

// Time complexity: O(n)

// Runtime  0ms     | Beats 100.00%
// Memory   42.41MB | Beats 43.15%