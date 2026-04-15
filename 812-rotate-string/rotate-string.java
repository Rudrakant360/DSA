class Solution {
    public void reverse(char[] arr,int low,int high){
        while(low<high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public boolean rotateString(String s, String goal) {
        int m = s.length();
        int n = goal.length();
        if (m != n) return false;
        char arr[] = s.toCharArray();
        char brr[] = goal.toCharArray();
        for(int k = 0;k<m;k++){
            char[] temp = Arrays.copyOf(arr,m);
            reverse(temp,0,m-1);
            reverse(temp,0,k);
            reverse(temp,k+1,m-1);
           if (Arrays.equals(temp,brr)) {
                return true;
            }
        }
        return false;
    }
}