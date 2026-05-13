class Solution {
    public int helper(int[] arr,int target,int low,int high){
        if(low>high) return -1;
        int mid = low+(high-low)/2;
        if(arr[mid] == target) return mid;
        if(arr[mid]<target) return helper(arr,target,mid+1,high);
        else return helper(arr,target,low,mid-1);
    }
    public int search(int[] arr, int target) {
       //by recursion
       return helper(arr,target,0,arr.length-1);
    }
}
//  int n = arr.length;
//         int low =0 ,  high= n-1;
//         while(low<=high){
//             int mid  = low+(high-low)/2;
//             if(arr[mid] == target) return mid;
//             else if(arr[mid]>target) high = mid-1;
//             else low = mid+1;
        
//         } 
//         return -1;