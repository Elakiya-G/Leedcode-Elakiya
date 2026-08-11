// Last updated: 8/11/2026, 4:04:43 PM
class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int price : prices){
            if(price < minprice){
                minprice = price;
            }else if(price-minprice>maxprofit){
                maxprofit = price - minprice;
            }
        }
        return maxprofit;
        }
}