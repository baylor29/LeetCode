public class Stock {
    public static void main(String[] args) {

        int[] prices = {};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++){
            if (prices[i]<min){
                min = prices[i];
            }
            if (prices[i]-min> profit){
                profit = prices[i]-min;
            }


        }
        return profit;


    }


}
