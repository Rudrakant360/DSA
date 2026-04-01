class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int j = 0 ;j<nums.length;j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] =temp;
                i++;
            }
        }
    }
}

    // int n = nums.length;
    //     int j = 0;
    // for (int i = 0; i < n; i++) {
    //         if (nums[i] != 0) {
    //             nums[j] = nums[i];
    //             j++;
    //         }
    //     }

    //     for (int i = j; i < n; i++) {
    //         nums[i] = 0;
    //     }


//it is done by bubble sort type 
      //   int n = nums.length;
      //   int count = 0;
      //  for(int i=0;i<n;i++){
      //   if(nums[i] == 0){
      //       count++;
      //   }
      //  }
      //  for(int i =0 ;i<count;i++){
      //   for(int j = 0;j<n-1-i;j++){
      //       if(nums[j]==0){
      //           int temp = nums[j];
      //           nums[j] = nums[j+1];
      //           nums[j+1] = temp;
      //       }
      //   }
      //  }