class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       helper(nums,new ArrayList<>(), ans);
       return ans;
    }
    public void helper(int[] nums,List<Integer> temp, List<List<Integer>> ans){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int num:nums){
            if(temp.contains(num)){
                continue;
            }
            temp.add(num);
            helper(nums,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}