class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map_S = new HashMap<>();
        Map<Character,Integer> map_T = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(map_S.containsKey(s.charAt(i))){
                map_S.put(s.charAt(i), map_S.get(s.charAt(i))+1);
            }
            else{
                map_S.put(s.charAt(i),1);
            }
            if(map_T.containsKey(t.charAt(i))){
                map_T.put(t.charAt(i), map_T.get(t.charAt(i))+1);
            }
            else{
                map_T.put(t.charAt(i),1);
            }
        }
        if(map_S.equals(map_T)){
            return true;
        }
        else{
            return false;
        }
    }
}