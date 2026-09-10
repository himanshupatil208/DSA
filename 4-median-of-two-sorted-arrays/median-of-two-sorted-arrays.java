class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int n=nums1.length;
        int m=nums2.length;
        int curr=0;
        int prev=0;
        for(int k=0; k<=(n+m)/2;k++){
            prev=curr;
            if(i<n &&  (j >= m || nums1[i] <= nums2[j])){
                
                curr=nums1[i];
                i++;
            }
            else{
                
                curr=nums2[j];
                j++;
            }
        }
        System.out.print(curr+"  "+prev+ " "+m);
        if((n+m)%2==0)
            return (double)(curr+prev)/2;
        else return curr;
    }
}