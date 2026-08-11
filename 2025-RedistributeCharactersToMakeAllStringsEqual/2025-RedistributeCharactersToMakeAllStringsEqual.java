// Last updated: 8/11/2026, 3:59:34 PM
class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];

        // Count frequency of all characters
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }
        }

        // Check divisibility
        int n = words.length;
        for (int count : freq) {
            if (count % n != 0) {
                return false;
            }
        }

        return true;
    }
}