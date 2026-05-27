class Solution {
    public boolean helper(String s,int left,int right){
        if(left>=right) return true;
        if(s.charAt(left)!=s.charAt(right)) return false;
        return helper(s,left+1,right-1);
    }
    public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    String str = "";
    for(int i = 0 ; i<s.length();i++){
        char ch = s.charAt(i);
        if((ch>='a' && ch<='z')||(ch>= '0' && ch<= '9')){
           str+=ch;
        }
    }
    return helper(str,0,str.length()-1);
       
    }
}