class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0,j = 0,maxlen = 0;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                maxlen = Math.max(maxlen, j - i + 1);
                j++;
            }
            else{
               set.remove(s.charAt(i));
                i++;   
            }
        }
        return maxlen;
    }
}