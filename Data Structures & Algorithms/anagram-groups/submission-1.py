class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        AnagramGroups = {}
        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
            
            key = tuple(count)
            AnagramGroups.setdefault(key, []).append(s)
        
        return list(AnagramGroups.values())