// Last updated: 9/11/2026, 9:32:17 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max = nums[0];
4        int min = nums[0];
5        int answer = nums[0];
6
7        for (int i = 1; i < nums.length; i++) {
8
9            // If current number is negative,
10            // max and min will swap
11            if (nums[i] < 0) {
12                int temp = max;
13                max = min;
14                min = temp;
15            }
16
17            max = Math.max(nums[i], max * nums[i]);
18            min = Math.min(nums[i], min * nums[i]);
19
20            answer = Math.max(answer, max);
21        }
22
23        return answer;
24    }
25}