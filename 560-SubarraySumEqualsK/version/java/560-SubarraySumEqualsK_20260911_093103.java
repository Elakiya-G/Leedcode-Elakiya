// Last updated: 9/11/2026, 9:31:03 AM
1import java.util.HashMap;
2
3class Solution {
4    public int subarraySum(int[] nums, int k) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6
7        // Sum 0 occurs once
8        map.put(0, 1);
9
10        int sum = 0;
11        int count = 0;
12
13        for (int i = 0; i < nums.length; i++) {
14            sum = sum + nums[i];
15
16            // Check whether sum - k exists
17            if (map.containsKey(sum - k)) {
18                count = count + map.get(sum - k);
19            }
20
21            // Store current prefix sum
22            map.put(sum, map.getOrDefault(sum, 0) + 1);
23        }
24
25        return count;
26    }
27}