class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}

        for num in nums:
            freq[num] = freq.get(num, 0) + 1

        unique_nums = list(freq.keys())

        unique_nums.sort(key=lambda x: freq[x], reverse=True)

        return unique_nums[:k]