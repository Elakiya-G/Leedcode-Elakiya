// Last updated: 8/11/2026, 3:59:31 PM
class Solution {
    public int minimumMoves(String s) {
        int count = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == 'X') {
                count++;
                i += 3;   // Convert this and the next two characters
            } else {
                i++;
            }
        }

        return count;
    }
}