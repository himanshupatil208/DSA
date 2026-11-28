class Solution {
    public int lengthOfLIS(int[] nums) {

        int n=nums.length;
        if(n==1)
            return 1;
        int[] dp=new int[n];

        dp[0]=1;
        Arrays.fill(dp,1);

        int res=0;
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){

                if(nums[i]>nums[j])
                    dp[i]=Math.max(dp[i],dp[j]+1);
                
            }
            res=Math.max(res, dp[i]);
            System.out.println("i: "+i+", dp: "+ dp[i]);
        }
       
        return res;
    }
}
