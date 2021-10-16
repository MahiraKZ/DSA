package Arrays;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices = new int[]{7,2,5,8,1,4};

        //Brute Force - O(N^2)
        int maxProfit  = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if(profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        System.out.println(maxProfit);

        //Optimized Approach - O(N)
        int minPrice = Integer.MAX_VALUE;
        maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        System.out.println(maxProfit);
    }
}
//[7, 2, 5,8,1,4]
//O(n)