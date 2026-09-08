// Last updated: 9/8/2026, 2:54:06 PM
1import java.util.*;
2
3class Solution {
4    public boolean isValid(String code) {
5        Stack<String> stack = new Stack<>();
6        int i = 0;
7        int n = code.length();
8
9        while (i < n) {
10
11            // CDATA
12            if (code.startsWith("<![CDATA[", i)) {
13                if (stack.isEmpty()) {
14                    return false;
15                }
16
17                int end = code.indexOf("]]>", i + 9);
18
19                if (end == -1) {
20                    return false;
21                }
22
23                i = end + 3;
24            }
25
26            // Closing tag
27            else if (code.startsWith("</", i)) {
28                int end = code.indexOf('>', i + 2);
29
30                if (end == -1) {
31                    return false;
32                }
33
34                String tag = code.substring(i + 2, end);
35
36                if (!isValidTag(tag)) {
37                    return false;
38                }
39
40                if (stack.isEmpty() || !stack.pop().equals(tag)) {
41                    return false;
42                }
43
44                i = end + 1;
45            }
46
47            // Opening tag
48            else if (code.charAt(i) == '<') {
49
50                // If there is no parent tag, this can only be
51                // the first and only root tag.
52                if (stack.isEmpty() && i != 0) {
53                    return false;
54                }
55
56                int end = code.indexOf('>', i + 1);
57
58                if (end == -1) {
59                    return false;
60                }
61
62                String tag = code.substring(i + 1, end);
63
64                if (!isValidTag(tag)) {
65                    return false;
66                }
67
68                stack.push(tag);
69                i = end + 1;
70            }
71
72            // Normal text
73            else {
74                if (stack.isEmpty()) {
75                    return false;
76                }
77
78                i++;
79            }
80        }
81
82        return stack.isEmpty();
83    }
84
85    private boolean isValidTag(String tag) {
86        if (tag.length() < 1 || tag.length() > 9) {
87            return false;
88        }
89
90        for (char c : tag.toCharArray()) {
91            if (c < 'A' || c > 'Z') {
92                return false;
93            }
94        }
95
96        return true;
97    }
98}