class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int m = s.length();
        int n = p.length();
        if(n > m) return ans;
        int arr[] = new int[26];
        for(int i = 0; i < n; i++) {
            arr[p.charAt(i) - 'a']++;
        }
        for(int i = 0; i <= m - n; i++) {
            int brr[] = new int[26];
            for(int j = 0; j < n; j++) {
                brr[s.charAt(i + j) - 'a']++;
            }
            if(ismatch(arr, brr)) {
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean ismatch(int arr[], int brr[]) {
        for(int i = 0; i < 26; i++) {
            if(arr[i] != brr[i]) {
                return false;
            }
        }
        return true;
    }
}