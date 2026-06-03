class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> map = new HashMap<>();
       Stack<Integer> st = new Stack<>();
       for(int i = nums2.length-1;i>=0;i--){
           while(!st.isEmpty() && st.peek()<nums2[i]){
            st.pop();
           }
           if(st.isEmpty()){
               map.put(nums2[i],-1);
           }
           else{
            map.put(nums2[i],st.peek());
           }
           st.push(nums2[i]);
       }
       int[] ans = new int[nums1.length];
       for(int i = 0;i<nums1.length;i++){
        ans[i] = map.get(nums1[i]);
       }
       return ans;
    }
}
//  for(int i = 0;i<nums1.length;i++){
//             int idx = -1;
//            for(int j = 0;j<nums2.length;j++){
//               if(nums2[j]==nums1[i]){
//                 idx = j;
//                 break;
//               }
//            }

//             int ans = -1;
//             for(int j=idx+1;j<nums2.length;j++){
//                 if(nums2[j]>nums1[i]){
//                     ans = nums2[j];
//                     break;
//                 }    
//             }
//             nums1[i] = ans;
//         }
//         return nums1;