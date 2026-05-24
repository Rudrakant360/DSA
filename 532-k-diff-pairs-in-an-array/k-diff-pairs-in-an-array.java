class Solution {
    public int findPairs(int[] arr, int k) {
         HashMap<Integer,Integer> map = new HashMap<>();
         for(int ele : arr){
             if(map.containsKey(ele)){
                 int freq = map.get(ele);
                 map.put(ele,freq+1);
             }
             else map.put(ele,1);
         }
         int pair = 0;
        for (int ele : map.keySet()) {
            if (k == 0) {
                if (map.get(ele) > 1) {
                    pair++;
                }
            } 
            else {
                if (map.containsKey(ele + k)) {
                    pair++;
                }
            }
        }
         return pair;
    }
}