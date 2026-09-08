class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> counts = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (counts.containsKey(c)) {
                counts.put(c, counts.get(c) - 1);

                if (counts.get(c) < 0) {
                    return false;
                }

            } else {
                return false;
            }
        }

        return true;
    }
}
