// Last updated: 9/11/2026, 9:26:37 AM
1import java.util.HashSet;
2
3class Solution {
4    public int longestConsecutive(int[] nums) {
5
6        HashSet<Integer> set = new HashSet<>();
7
8        // Store all numbers
9        for (int i = 0; i < nums.length; i++) {
10            set.add(nums[i]);
11        }
12
13        int longest = 0;
14
15        // Loop through unique numbers
16        for (int num : set) {
17
18            // Only start from the first number
19            if (!set.contains(num - 1)) {
20
21                int current = num;
22                int count = 1;
23
24                // Find consecutive numbers
25                while (set.contains(current + 1)) {
26                    current++;
27                    count++;
28                }
29
30                longest = Math.max(longest, count);
31            }
32        }
33
34        return longest;
35    }
36}