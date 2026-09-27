class Solution {
    public int mySqrt(int x) {
         if (x < 2) {
            return x;
        }

        int i = 1;
        int j = x;

        while (i <= j) {

            int mid = i + (j - i) / 2;

            if (mid <= x / mid) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return j;
    }
}