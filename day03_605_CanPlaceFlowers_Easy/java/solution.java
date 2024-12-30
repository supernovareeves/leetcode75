class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;
        System.out.println(sol.canPlaceFlowers(flowerbed, n));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int counter = 0;
        for (int i=0; i<flowerbed.length; i++) {
            if (flowerbed[i]==0) {
                if ((i==0 || flowerbed[i-1]==0) &&
                    (i==flowerbed.length-1 || flowerbed[i+1]==0)) {
                        // leftEmpty && rightEmpty
                        flowerbed[i]=1;
                        counter++;
                    }
            }
        }
        return counter>=n;
    }
}

// Time complexity: O(n)

// Runtime  1ms     | Beats 96.74%
// Memory   45.57MB | Beats 63.54%