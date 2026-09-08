// Last updated: 9/8/2026, 2:40:05 PM
1class Solution {
2    public int tribonacci(int n) {
3        if (n == 0) {
4            return 0;
5        }
6
7        if (n == 1 || n == 2) {
8            return 1;
9        }
10
11        int a = 0;
12        int b = 1;
13        int c = 1;
14
15        for (int i = 3; i <= n; i++) {
16            int d = a + b + c;
17
18            a = b;
19            b = c;
20            c = d;
21        }
22
23        return c;
24    }
25}