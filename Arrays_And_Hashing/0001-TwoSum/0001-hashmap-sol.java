class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashmap = new HashMap();
        int complement;
        for(int i = 0; i <nums.length; i++){
            complement = target - nums[i];
            if(hashmap.containsKey(complement)){
                return new int[]{i,hashmap.get(complement)};
            }
            else{
                hashmap.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}