class Solution {
    public int maxProfit(int[] nums) {
        int maxprofit = 0;
        int buyprice = nums[0];
       for(int i = 0;i<nums.length;i++){
         if(buyprice > nums[i]){
            buyprice = nums[i];
         }
         else{
            int profit = nums[i] - buyprice;
            maxprofit = Math.max(profit,maxprofit);
         }
       }
       return maxprofit;
    }
}