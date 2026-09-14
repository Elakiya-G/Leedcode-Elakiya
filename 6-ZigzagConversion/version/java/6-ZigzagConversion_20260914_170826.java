// Last updated: 9/14/2026, 5:08:26 PM
1class Solution {
2    public String convert(String s, int numRows) {
3
4        if (numRows == 1 || numRows >= s.length()) {
5            return s;
6        }
7
8        String result = "";
9
10        for (int row = 0; row < numRows; row++) {
11
12            int index = row;
13            boolean down = true;
14
15            while (index < s.length()) {
16
17                result = result + s.charAt(index);
18
19                if (row == 0 || row == numRows - 1) {
20                    index = index + 2 * (numRows - 1);
21                } else {
22                    if (down) {
23                        index = index + 2 * (numRows - row - 1);
24                    } else {
25                        index = index + 2 * row;
26                    }
27
28                    down = !down;
29                }
30            }
31        }
32
33        return result;
34    }
35}