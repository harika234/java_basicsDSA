public class BestTimetoBuyandSellStockI {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 2, 4};
        int ans = check_profit(arr);
        System.out.println(ans);
    }
    public static int check_profit(int[] arr){
        int n = arr.length;
        if(n==0 || n==1){
            return 0;
        }

        int min_price = arr[0];
        int max_profit = 0;
        for(int i=1; i<n; i++){
            int current_price = arr[i];
            if(current_price>min_price){
                int profit = current_price-min_price;
                if(profit > max_profit){
                    max_profit = profit;
                }
            }

            else{
                min_price=current_price;
            }
        }
        return max_profit;
    }
}
