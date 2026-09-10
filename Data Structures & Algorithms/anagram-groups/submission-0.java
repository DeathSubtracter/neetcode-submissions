class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26]; // 26 is length of alphabet
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String countKey = Arrays.toString(count);
            anagramGroups.putIfAbsent(countKey, new ArrayList<>());
            anagramGroups.get(countKey).add(s);
        }

        return new ArrayList<>(anagramGroups.values());
    }
}
