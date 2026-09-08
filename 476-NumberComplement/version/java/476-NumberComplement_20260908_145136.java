// Last updated: 9/8/2026, 2:51:36 PM
1class Solution {
2    public int findComplement(int num) {
3        int mask = 0;
4        int temp = num;
5
6        while (temp != 0) {
7            mask = (mask << 1) | 1;
8            temp = temp >> 1;
9        }
10
11        return num ^ mask;
12    }
13}