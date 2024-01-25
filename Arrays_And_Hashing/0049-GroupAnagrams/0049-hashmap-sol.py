class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #Idea is to have sorted words as keys in the hashmap, and the values to be the non sorted words that belong to that key.
        #Time complexity should be n log n, due to sorting being used.
        hashmap = {}
        length = len(strs)
        for i in range(length):
            sortedWord=''.join(sorted(strs[i]))
            if sortedWord in hashmap:
                hashmap[sortedWord].append(strs[i])
            else: hashmap[sortedWord] = [strs[i]]
        result = []
        for i in hashmap:
            result.append(hashmap[i])
        return result