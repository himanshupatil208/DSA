class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int water=0;
        while(i<j){
            int temp=(j-i)*Math.min(height[i],height[j]);

            if(temp>water)
                water=temp;
            if(height[i]<height[j])
                i++;
            else
                j--;
        }

        return water;
    }
}