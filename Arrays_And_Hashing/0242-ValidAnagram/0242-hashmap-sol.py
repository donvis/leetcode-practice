class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        countS= {}
        countT= {}
        # Create two dictionaries, which are like HashMaps in python
        # looping through each string, if character is a key in dictionary, add 1 to its value.
        # if character is not a key in the dictionary, add the key and value 1.

        # compare the dictionaries to check if they are equal.

        # Time complexity should be O(n) for placing keys into the dictionary 
        for i in range(len(s)):
            if s[i] in countS: countS[s[i]] +=1
            else: countS[s[i]] = 1
        
        for i in range(len(t)):
            if t[i] in countT: countT[t[i]] +=1
            else: countT[t[i]] = 1
        if countS == countT: 
            return True
        else: return False