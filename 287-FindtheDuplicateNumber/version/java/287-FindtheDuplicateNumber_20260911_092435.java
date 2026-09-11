// Last updated: 9/11/2026, 9:24:35 AM
1class Solution {
2    public int findDuplicate(int[] nums) {
3
4        int slow = nums[0];
5        int fast = nums[0];
6
7        // Find the meeting point
8        do {
9            slow = nums[slow];
10            fast = nums[nums[fast]];
11        } while (slow != fast);
12
13        // Find the duplicate number
14        slow = nums[0];
15
16        while (slow != fast) {
17            slow = nums[slow];
18            fast = nums[fast];
19        }
20
21        return slow;
22    }
23}