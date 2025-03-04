package Programming.DynamicProgramming;

public class BuyAndSellStocks {

    public static void main(String[] args) {

        int[] nums = new int[]{7,1,5,3,6,4};
        System.out.println("Max Profit is: "+findingMaxProfit(nums));
    }

    public static int findingMaxProfit(int[] prices) {
        int buy_price = prices[0];
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy_price){
                buy_price = prices[i];
            }

            int current_profit = prices[i] - buy_price;
            profit = Math.max(current_profit,profit);
        }

       return profit;
    }
}
