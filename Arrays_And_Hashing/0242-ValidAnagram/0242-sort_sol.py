class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # if s is an anagram of t, they both should have the exact same characters, in the same order after being sorted.
        # By sorting both strings, we check if they are equal.
        # Time complexity should be O(nlogn) due to sorting being used.
        s =sorted(s)
        t =sorted(t)
        if s == t:
            return True
        else: return False