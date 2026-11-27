class Solution {
    int max = Integer.MIN_VALUE;
    public int maxProduct(int[] nums) {
        
        int res=Integer.MIN_VALUE;
        int currMax=1;
        int currMin=1;

        for(int n : nums){
            int temp = currMax * n;
            currMax=Math.max(n, Math.max(currMin * n, currMax * n));
            currMin=Math.min(n, Math.min(currMin * n, temp));

            res=Math.max(res, currMax);

        }

        return res;

    }
}
