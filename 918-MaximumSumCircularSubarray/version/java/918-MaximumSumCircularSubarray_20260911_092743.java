// Last updated: 9/11/2026, 9:27:43 AM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3
4        int total = 0;
5
6        int currentMax = 0;
7        int maxSum = nums[0];
8
9        int currentMin = 0;
10        int minSum = nums[0];
11
12        for (int i = 0; i < nums.length; i++) {
13
14            total = total + nums[i];
15
16            // Kadane's algorithm for maximum subarray
17            currentMax = Math.max(nums[i], currentMax + nums[i]);
18            maxSum = Math.max(maxSum, currentMax);
19
20            // Kadane's algorithm for minimum subarray
21            currentMin = Math.min(nums[i], currentMin + nums[i]);
22            minSum = Math.min(minSum, currentMin);
23        }
24
25        // If all numbers are negative
26        if (maxSum < 0) {
27            return maxSum;
28        }
29
30        // Maximum circular sum
31        int circularSum = total - minSum;
32
33        return Math.max(maxSum, circularSum);
34    }
35}