class Solution {
    public boolean isAnagram(String s, String t) {
        // Create two hashmaps for string s and t
        // First check if length of s and t is equal. if not, return false as these are not anagrams.
        // now we can just use 1 for loop to check if the hashmaps contains the character.
        // if hash maps don't contain the current character, add it into the hashmap, otherwise increment value of key by 1.
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