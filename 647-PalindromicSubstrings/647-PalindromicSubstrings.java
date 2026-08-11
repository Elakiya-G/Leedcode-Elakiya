// Last updated: 8/11/2026, 4:01:31 PM
class Solution {
    int count = 0;

    public int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i);       // Odd-length palindrome
            expand(s, i, i + 1);   // Even-length palindrome
        }
        return count;
    }

    public void expand(String s, int left, int right) {
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
    }
}