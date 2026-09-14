// Last updated: 9/14/2026, 5:13:27 PM
1class Solution {
2    public int splitArray(int[] nums, int k) {
3
4        long left = 0;
5        long right = 0;
6
7        // Find the minimum and maximum possible answer
8        for (int num : nums) {
9            left = Math.max(left, num);
10            right = right + num;
11        }
12
13        // Binary Search
14        while (left < right) {
15
16            long mid = left + (right - left) / 2;
17
18            int parts = 1;
19            long sum = 0;
20
21            for (int num : nums) {
22
23                if (sum + num > mid) {
24                    parts++;
25                    sum = num;
26                } else {
27                    sum = sum + num;
28                }
29            }
30
31            if (parts <= k) {
32                right = mid;
33            } else {
34                left = mid + 1;
35            }
36        }
37
38        return (int) left;
39    }
40}