// Last updated: 9/14/2026, 5:07:36 PM
1class Solution {
2    public String countAndSay(int n) {
3        String result = "1";
4
5        for (int i = 1; i < n; i++) {
6            String next = "";
7            int count = 1;
8
9            for (int j = 1; j < result.length(); j++) {
10                if (result.charAt(j) == result.charAt(j - 1)) {
11                    count++;
12                } else {
13                    next = next + count + result.charAt(j - 1);
14                    count = 1;
15                }
16            }
17
18            // Add the last character
19            next = next + count + result.charAt(result.length() - 1);
20
21            result = next;
22        }
23
24        return result;
25    }
26}