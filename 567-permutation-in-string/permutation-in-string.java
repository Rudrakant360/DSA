class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int arr[] = new int[26];
        for(int i=0;i<m;i++){
            arr[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<=n-m;i++){
          int brr[] = new int[26];
          for(int j=0;j<m;j++){
            brr[s2.charAt(i+j)-'a']++;
          }
          if(ismatched(arr,brr)){
            return true;
          }
        }
          return false;
    }
    public boolean ismatched(int arr[],int brr[]){
        for(int i=0;i<26;i++){
            if(arr[i] != brr[i]){
                return false;
            }
        }
        return true;
    }
}