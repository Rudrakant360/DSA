class Solution {
    public boolean helper(int left,int right,String s){
         if(left>=right) return true;
         if(s.charAt(left) != s.charAt(right)) return false;
         return helper(left+1,right-1,s);
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String ans = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') ||(ch >= '0' && ch <= '9')){
                ans+=ch;
            }
        }
       return helper(0,ans.length()-1,ans);
    }
}