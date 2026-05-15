class Solution {
    static List<String> ans;
    public void permu(int left,int right,int n,String s){
        if(s.length() == 2*n){
            ans.add(s);
            return;
        }
        if(left<n) permu(left+1,right,n,s+'(');
        if(right<left) permu(left,right+1,n,s+')');
    }
    public List<String> generateParenthesis(int n) {
       ans = new ArrayList<>();
       permu(0,0,n,"");
       return ans;
    }
}