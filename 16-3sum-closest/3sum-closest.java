class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int j;
        int k;
        int sum=nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            j=i+1;
            k=n-1;
            
            while(j<k){
                int temp=nums[i]+nums[j]+nums[k];
                
                
                if (Math.abs(target - temp) < Math.abs(target - sum))
                    sum = temp;
                if (temp == target)
                    return temp;
                else if (temp < target)
                    j++;
                else
                    k--;
            }
        }

        return sum;
    }
}