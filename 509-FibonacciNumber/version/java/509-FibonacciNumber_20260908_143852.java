// Last updated: 9/8/2026, 2:38:52 PM
1class Solution {
2    public int fib(int n) {
3        if (n == 0) {
4            return 0;
5        }
6
7        if (n == 1) {
8            return 1;
9        }
10
11        int a = 0;
12        int b = 1;
13
14        for (int i = 2; i <= n; i++) {
15            int c = a + b;
16            a = b;
17            b = c;
18        }
19
20        return b;
21    }
22}