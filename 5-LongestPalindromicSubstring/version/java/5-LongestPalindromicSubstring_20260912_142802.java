// Last updated: 9/12/2026, 2:28:02 PM
1class Solution {
2    public String longestPalindrome(String s) {
3
4        if (s.length() < 2) {
5            return s;
6        }
7
8        String ans = "";
9
10        for (int i = 0; i < s.length(); i++) {
11
12            // Odd length palindrome
13            String p1 = expand(s, i, i);
14
15            // Even length palindrome
16            String p2 = expand(s, i, i + 1);
17
18            if (p1.length() > ans.length()) {
19                ans = p1;
20            }
21
22            if (p2.length() > ans.length()) {
23                ans = p2;
24            }
25        }
26
27        return ans;
28    }
29
30    public String expand(String s, int left, int right) {
31
32        while (left >= 0 && right < s.length()
33                && s.charAt(left) == s.charAt(right)) {
34
35            left--;
36            right++;
37        }
38
39        return s.substring(left + 1, right);
40    }
41}