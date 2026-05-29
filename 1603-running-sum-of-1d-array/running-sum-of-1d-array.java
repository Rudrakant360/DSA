class Solution {
    public void helper(int[] nums, int i) {
        if(i == nums.length) return;
        nums[i] += nums[i - 1];
        helper(nums, i + 1);
    }
    public int[] runningSum(int[] nums) {
        if(nums.length > 1) {
            helper(nums, 1);
        }
        return nums;
    }
}
// for(int i = 1;i<nums.length;i++){
//             nums[i] = nums[i]+nums[i-1];
//         }
//         return nums;