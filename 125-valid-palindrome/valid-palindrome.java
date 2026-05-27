class Solution {
    public boolean helper(String s){
        for(int i = 0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
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
    return helper(str);
       
    }
}