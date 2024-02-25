package Arrays;
public class buy_sell_stocks {
    public static int buySellStocks(int[] nums){
        int buy = Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<nums.length;i++){
            if(buy<nums[i]){
                int profit=nums[i]-buy;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buy=nums[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[]args){
        int [] nums = {7,1,5,3,6,4};
        int res= buySellStocks(nums);
        System.out.println(res);
        
    }
}
