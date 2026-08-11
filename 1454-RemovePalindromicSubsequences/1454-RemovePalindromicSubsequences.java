// Last updated: 8/11/2026, 4:00:06 PM
class Solution {
    public int removePalindromeSub(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return 2;
            }
            i++;
            j--;
        }

        return s.length() == 0 ? 0 : 1;
    }
}