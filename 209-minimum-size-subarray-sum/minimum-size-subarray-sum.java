class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j = 0;
        int minlength = Integer.MAX_VALUE;
        int sum = 0;
        while(j<nums.length){
            sum+=nums[j];
             j++;
            while(sum>=target){
                minlength = Math.min(minlength,j-i);
                sum-=nums[i];
                i++;
            }              
        }
       return minlength == Integer.MAX_VALUE ? 0 : minlength;
    }
}