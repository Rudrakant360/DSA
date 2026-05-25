class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashSet<Character> set = new HashSet<>();
        //ulangwar
        int i = 0 , j = 0 , maxlen = 1;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
            }
            else{
                int len = j-i;
                maxlen = Math.max(len,maxlen);
                 while(s.charAt(i) != s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                 }
                i++;
                j++;
            }
        }
        int len = j-i;
        maxlen = Math.max(len,maxlen);
        return maxlen;
    }
}