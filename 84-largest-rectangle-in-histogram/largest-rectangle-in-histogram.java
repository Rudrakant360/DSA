class Solution {

    public int[] nextsmaller(int[] nums){
        int n = nums.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1;i>=0;i--){
            while(st.size()>0 && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            nse[i] = st.empty()?n:st.peek();
            st.push(i);
        }
        return nse;
    }

    public int[] previoussmaller(int[] nums){
        int n = nums.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<=n-1;i++){
            while(st.size()>0 && nums[st.peek()]>=nums[i]){
                st.pop();
            }
             pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }

    public int largestRectangleArea(int[] heights) {
        int[] pse = previoussmaller(heights);
        int[] nse = nextsmaller(heights);
        int maxarea = 0;
        for (int i = 0; i < heights.length; i++) {
            int area = heights[i] * (nse[i] - pse[i] - 1);
            maxarea = Math.max(maxarea, area);
        }

        return maxarea;
    }
}