// Last updated: 9/14/2026, 5:03:32 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left < right) {
7            int mid = left + (right - left) / 2;
8
9            if (nums[mid] < nums[right]) {
10                right = mid;
11            }
12            else if (nums[mid] > nums[right]) {
13                left = mid + 1;
14            }
15            else {
16                right--;
17            }
18        }
19
20        return nums[left];
21    }
22}