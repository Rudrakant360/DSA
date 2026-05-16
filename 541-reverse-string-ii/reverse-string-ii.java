class Solution {
    public void reverse(char[] arr, int left, int right) {
        if(left >= right) return;
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse(arr, left + 1, right - 1);
    }
    public void helper(char[] arr, int start, int k) {
        if(start >= arr.length) return;
        int right = Math.min(start + k - 1, arr.length - 1);
        reverse(arr, start, right);
        helper(arr, start + 2 * k, k);
    }
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        helper(arr, 0, k);
        return new String(arr);
    }
}