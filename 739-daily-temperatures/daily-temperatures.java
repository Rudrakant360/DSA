class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0; i--) {
             while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
             }
             if(st.isEmpty()){
                ans[i] = 0;
             }
             else{
                ans[i]=st.peek()-i;
             }
             st.add(i);
        }
        return ans;
    }
}