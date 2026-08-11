// Last updated: 8/11/2026, 3:58:35 PM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int n=prices.length;
        int m=discounts.length;
        double total=0;
        for(int price:prices){
            total+=price;
            
        }
        int k=Math.min(n,m);
        for(int i=0;i<k;i++){
            int price=prices[n-1-i];
            int discount=discounts[m-1-i];
            double saving=(price*discount)/100.0;
            total-=saving;
            
        }
        return total;
    }
}