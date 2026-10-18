class Solution {
    public int maxProfit(int[] prices) {
        int temp=0;
        int price=prices[0];
        for(int i=1;i<prices.length;i++){
                if((price>prices[i]))
                    price=prices[i];
                if(temp<(prices[i]-price))
                    temp=prices[i]-price;

        }
        return temp;
    }
}