// Last updated: 8/11/2026, 3:59:45 PM
class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
                if (count == k) {
                    return s.substring(0, i);
                }
            }
        }

        return s;
    }
}