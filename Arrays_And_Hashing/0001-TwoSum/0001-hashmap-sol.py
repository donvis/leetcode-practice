class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # Create Hashmap
        # loop through the list of integers
            # If complement is in hashmap, return i (index of current element) and index of complement in hashmap
            # Otherwise, add the index of the element into the hashmap
        
        hashmap = {}
        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in hashmap:
                return [i,hashmap[complement]]
            else:
                hashmap[nums[i]] = i 
        return []