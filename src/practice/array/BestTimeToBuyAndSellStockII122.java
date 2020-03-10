package practice.array;

/**
 * Created by apple on 2020/3/2.
 */
public class BestTimeToBuyAndSellStockII122 {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }
}
