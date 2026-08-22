// Last updated: 8/22/2026, 10:22:23 AM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3
4        Arrays.sort(g);
5        Arrays.sort(s);
6
7        int child = 0;
8        int cookie = 0;
9
10        while (child < g.length && cookie < s.length) {
11
12            if (s[cookie] >= g[child]) {
13                child++;
14            }
15
16            cookie++;
17        }
18
19        return child;
20    }
21}