public class Stock2 {
    public static void main(String[] args) {

        int[] prices = {2,1,2,1,0,1,2}; //0,1,1
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);

    }
    public static int maxProfit(int[] prices){
        int profit = 0;
        int max = 0;
        for (int i = 0; i < prices.length - 1; i ++){
            profit = profit + prices[i+1] - prices[i];
            if (profit< 0 ) profit = 0;

            if (profit > max){
                max = profit;
            }
        }

        return max;
    }
}
