// Last updated: 9/14/2026, 5:09:18 PM
1import java.util.*;
2
3class Solution {
4    public int sumDistance(int[] nums, String s, int d) {
5        int n = nums.length;
6        long[] pos = new long[n];
7
8        // Find final positions
9        for (int i = 0; i < n; i++) {
10            if (s.charAt(i) == 'R') {
11                pos[i] = (long) nums[i] + d;
12            } else {
13                pos[i] = (long) nums[i] - d;
14            }
15        }
16
17        // Sort positions
18        Arrays.sort(pos);
19
20        long result = 0;
21        long prefix = 0;
22        long mod = 1000000007;
23
24        // Calculate sum of distances
25        for (int i = 0; i < n; i++) {
26            result = (result + pos[i] * i - prefix) % mod;
27            prefix = (prefix + pos[i]) % mod;
28        }
29
30        return (int) result;
31    }
32}