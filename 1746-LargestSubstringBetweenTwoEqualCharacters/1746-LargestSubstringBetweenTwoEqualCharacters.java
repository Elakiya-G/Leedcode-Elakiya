// Last updated: 8/11/2026, 3:59:53 PM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] first = new int[26];

        // Initialize all positions to -1
        for (int i = 0; i < 26; i++) {
            first[i] = -1;
        }

        int max = -1;

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if (first[index] == -1) {
                first[index] = i; // Store first occurrence
            } else {
                max = Math.max(max, i - first[index] - 1);
            }
        }

        return max;
    }
}