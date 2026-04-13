class Solution {
    public void rev(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        char[] arr = s.toCharArray();
        rev(arr, 0, arr.length - 1);
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == ' ') {
                rev(arr, left, right - 1);
                left = right + 1;
            }
        }
        rev(arr, left, arr.length - 1);
        return new String(arr);
    }
}