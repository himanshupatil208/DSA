class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] leftPro=new int[n];
        int[] maxPro=new int[n];
        leftPro[0]=1;
        maxPro[n-1]=1;
        for(int i=1;i<n;i++){
            leftPro[i]=nums[i-1]*leftPro[i-1];
        }
        for(int i=0;i<n;i++){
            System.out.print(leftPro[i] + " ");
        }

        for(int i=n-2;i>=0;i--){
            maxPro[i]=nums[i+1]*maxPro[i+1];
        }
        System.out.println("");
        for(int i=0;i<n;i++){
            System.out.print(maxPro[i] + " ");
        }

        for(int i=0;i<n;i++){
            leftPro[i]=leftPro[i]*maxPro[i];
        }


        return leftPro;
    }
}