class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>(); // Key: num, Value: index

        for (int i = 0; i < nums.length; i++) {
            int targetDiff = target - nums[i];

            if (seen.containsKey(targetDiff)) {
                return new int[]{seen.get(targetDiff), i};
            }

            seen.put(nums[i], i);
        }

        return new int[]{};
    }
}
