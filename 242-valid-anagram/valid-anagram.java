class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ele : s.toCharArray()){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }
        for(char ele : t.toCharArray()){
            if(map.containsKey(ele)){
               int freq = map.get(ele);
               if(freq == 0){
                 return false;
               }
               map.put(ele,freq-1); 
            }
            else return false;
        }
        return true;
    }
}

        // if (s.length() != t.length()) {
        //     return false;
        // }
        // s = s.toLowerCase();
        // t = t.toLowerCase();
        // s = s.replace(" ","");
        // t = t.replace(" ","");

        // int count[] = new int[26];
        // for(int i = 0 ; i < s.length() ; i++){
        //     count[s.charAt(i) - 'a']++;
        // }
        // for(int i = 0 ; i < t.length() ; i++){
        //     count[t.charAt(i) - 'a']--;
        // }
        // for(int i = 0;i<26;i++){
        //     if(count[i] != 0) return false;
        // }
        // return true;
