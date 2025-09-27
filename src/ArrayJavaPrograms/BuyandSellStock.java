package ArrayJavaPrograms;

public class BuyandSellStock {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 9, 2, 8};
        int buyPrice = arr[0];
        int profit = 0;
        int todayPrice = arr[0];
        int currentProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            todayPrice = arr[i];
            if (todayPrice < buyPrice) {
                buyPrice = todayPrice;
            } else {
                currentProfit = todayPrice - buyPrice;
                profit = Math.max(profit, currentProfit);
            }
        }
        System.out.println(profit);
    }
}
