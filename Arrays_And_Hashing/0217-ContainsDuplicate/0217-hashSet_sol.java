class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Same as python solution, we use a HashSet to deal with this frequency problem.
        // 1.Firstly create a HashSet.
        // 2.Using a for loop to check the integers in nums, if the hash set contains the integer,
        //   it means there is a duplicate. Therefore, we return true
        //   Else, we add the number into the HashSet and continue the loop.
        // 3.If we loop through the whole list and there is no duplicates found during the check, return false
        HashSet<Integer> hash_set = new HashSet<>();
        for(int num : nums){
            if(hash_set.contains(num)){
                return true;
            }
            hash_set.add(num);
        }
        return false;
    }
}