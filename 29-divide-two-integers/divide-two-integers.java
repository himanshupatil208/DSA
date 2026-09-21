class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long i = Math.abs((long) dividend);
        long j = Math.abs((long) divisor);
        int count=0;
        while (i >= j) {
            
            long temp = j;
            int multiple = 1;

            while (i >= temp + temp) {
                temp = temp + temp;
                multiple = multiple + multiple;
            }

            i = i - temp;
            count = count + multiple;
        }

        if((dividend<0 && divisor<0) || (dividend>0 && divisor>0)){
            return count;
        }
        else return -count;

    }
}