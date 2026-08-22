// Last updated: 8/22/2026, 9:19:09 AM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n = nums.length;
4        int[] result = new int[n];
5
6        int left = 0;
7        int right = n - 1;
8        int index = n - 1;
9
10        while (left <= right) {
11            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
12                result[index] = nums[left] * nums[left];
13                left++;
14            } else {
15                result[index] = nums[right] * nums[right];
16                right--;
17            }
18
19            index--;
20        }
21
22        return result;
23    }
24}