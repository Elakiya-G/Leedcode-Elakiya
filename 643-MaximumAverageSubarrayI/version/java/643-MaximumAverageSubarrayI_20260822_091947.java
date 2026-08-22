// Last updated: 8/22/2026, 9:19:47 AM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum = 0;
4
5        for (int i = 0; i < k; i++) {
6            sum += nums[i];
7        }
8
9        int maxSum = sum;
10
11        for (int i = k; i < nums.length; i++) {
12            sum = sum - nums[i - k] + nums[i];
13            maxSum = Math.max(maxSum, sum);
14        }
15
16        return (double) maxSum / k;
17    }
18}