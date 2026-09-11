class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int sum=0;
        for(int n:nums){
            if(n>=0)
                set.add(n);
        }

        for(int n:set)
            sum=sum+n;

        if(set.isEmpty()){
            int max=Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }

            return max;
        }
        return sum;
    }
}