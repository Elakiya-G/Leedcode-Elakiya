// Last updated: 9/11/2026, 9:06:10 AM
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        String s = Integer.toBinaryString(n);
4
5        for (int i = 1; i < s.length(); i++) {
6            if (s.charAt(i) == s.charAt(i - 1)) {
7                return false;
8            }
9        }
10
11        return true;
12    }
13}