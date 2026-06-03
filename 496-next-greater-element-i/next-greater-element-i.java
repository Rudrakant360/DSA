class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0;i<nums1.length;i++){
            int idx = -1;
           for(int j = 0;j<nums2.length;j++){
              if(nums2[j]==nums1[i]){
                idx = j;
                break;
              }
           }
            
            int ans = -1;
            for(int j=idx+1;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    ans = nums2[j];
                    break;
                }    
            }
            nums1[i] = ans;
        }
        return nums1;
    }
}