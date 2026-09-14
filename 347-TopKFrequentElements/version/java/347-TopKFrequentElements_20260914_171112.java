// Last updated: 9/14/2026, 5:11:12 PM
1import java.util.*;
2
3class Solution {
4    public int[] topKFrequent(int[] nums, int k) {
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        // Count frequency
9        for (int num : nums) {
10            map.put(num, map.getOrDefault(num, 0) + 1);
11        }
12
13        // Convert map entries to list
14        List<Map.Entry<Integer, Integer>> list =
15                new ArrayList<>(map.entrySet());
16
17        // Sort by frequency in descending order
18        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
19
20        int[] result = new int[k];
21
22        // Take first k elements
23        for (int i = 0; i < k; i++) {
24            result[i] = list.get(i).getKey();
25        }
26
27        return result;
28    }
29}