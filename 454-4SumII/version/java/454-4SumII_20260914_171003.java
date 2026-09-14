// Last updated: 9/14/2026, 5:10:03 PM
1import java.util.*;
2
3class Solution {
4    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        // Store sums of nums1 + nums2
9        for (int i = 0; i < nums1.length; i++) {
10            for (int j = 0; j < nums2.length; j++) {
11                int sum = nums1[i] + nums2[j];
12
13                map.put(sum, map.getOrDefault(sum, 0) + 1);
14            }
15        }
16
17        int count = 0;
18
19        // Find opposite sums in nums3 + nums4
20        for (int i = 0; i < nums3.length; i++) {
21            for (int j = 0; j < nums4.length; j++) {
22                int sum = nums3[i] + nums4[j];
23
24                int required = -sum;
25
26                if (map.containsKey(required)) {
27                    count = count + map.get(required);
28                }
29            }
30        }
31
32        return count;
33    }
34}