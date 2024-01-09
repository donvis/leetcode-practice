class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # We are finding for duplicates, so it is a 'frequency' problem.
        # Since sets does not allow any duplicates, we can just compare the length of a set that we put nums into, with the length of the list nums..
        # If the length is equal, it means there are no duplicates, and thus we return false.
        # If the length is not equal, it means that some integers are removed from the set, implying that there are duplicates and thus we return true
        if len(set(nums))==len(nums):
            return False
        else: return True