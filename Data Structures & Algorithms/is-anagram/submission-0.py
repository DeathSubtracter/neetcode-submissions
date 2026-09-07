class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        s_counts = dict()
        for char in s:
            s_counts[char] = s_counts.get(char, 0) + 1
        
        for char in t:
            if char not in s_counts:
                return False
            
            s_counts[char] -= 1
            if s_counts[char] < 0:
                return False
        
        return True