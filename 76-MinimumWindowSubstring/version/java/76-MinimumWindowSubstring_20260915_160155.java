// Last updated: 9/15/2026, 4:01:55 PM
1class Solution {
2    public String minWindow(String s, String t) {
3
4        if (s.length() < t.length()) {
5            return "";
6        }
7
8        int[] count = new int[128];
9
10        // Store the frequency of characters in t
11        for (char c : t.toCharArray()) {
12            count[c]++;
13        }
14
15        int left = 0;
16        int right = 0;
17        int required = t.length();
18
19        int minLength = Integer.MAX_VALUE;
20        int start = 0;
21
22        while (right < s.length()) {
23
24            char c = s.charAt(right);
25
26            // If this character is required
27            if (count[c] > 0) {
28                required--;
29            }
30
31            count[c]--;
32            right++;
33
34            // Window contains all characters of t
35            while (required == 0) {
36
37                // Update minimum window
38                if (right - left < minLength) {
39                    minLength = right - left;
40                    start = left;
41                }
42
43                char leftChar = s.charAt(left);
44                count[leftChar]++;
45
46                if (count[leftChar] > 0) {
47                    required++;
48                }
49
50                left++;
51            }
52        }
53
54        if (minLength == Integer.MAX_VALUE) {
55            return "";
56        }
57
58        return s.substring(start, start + minLength);
59    }
60}