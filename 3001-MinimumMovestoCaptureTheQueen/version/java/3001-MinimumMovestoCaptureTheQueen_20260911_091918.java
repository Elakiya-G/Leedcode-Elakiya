// Last updated: 9/11/2026, 9:19:18 AM
1class Solution {
2    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
3
4        // Rook captures queen in 1 move
5        if (a == e) {
6            // Bishop is not between them
7            if (!(c == a && d > Math.min(b, f) && d < Math.max(b, f))) {
8                return 1;
9            }
10        }
11
12        if (b == f) {
13            // Bishop is not between them
14            if (!(d == b && c > Math.min(a, e) && c < Math.max(a, e))) {
15                return 1;
16            }
17        }
18
19        // Bishop captures queen in 1 move
20        if (Math.abs(c - e) == Math.abs(d - f)) {
21
22            // Rook is NOT on the same diagonal between bishop and queen
23            if (!(Math.abs(a - c) == Math.abs(b - d) &&
24                  a > Math.min(c, e) &&
25                  a < Math.max(c, e))) {
26                return 1;
27            }
28
29            if (!(Math.abs(a - c) == Math.abs(b - d) &&
30                  b > Math.min(d, f) &&
31                  b < Math.max(d, f))) {
32                return 1;
33            }
34        }
35
36        return 2;
37    }
38}