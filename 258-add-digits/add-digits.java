class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num%10!=0 || num/10!=0 ){
            sum=0;
            while(num%10!=0 || num/10!=0 ){
                sum+=num%10;
                num=num/10;
            }
            if(sum/10 !=0){
                num=sum;
            }
            else break;
        }

        return sum;
    }
}