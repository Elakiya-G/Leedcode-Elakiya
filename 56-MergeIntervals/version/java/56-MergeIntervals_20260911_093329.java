// Last updated: 9/11/2026, 9:33:29 AM
1import java.util.*;
2
3class Solution {
4    public int[][] merge(int[][] intervals) {
5
6        // Sort based on starting value
7        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
8
9        ArrayList<int[]> list = new ArrayList<>();
10
11        int start = intervals[0][0];
12        int end = intervals[0][1];
13
14        for (int i = 1; i < intervals.length; i++) {
15
16            // Overlapping intervals
17            if (intervals[i][0] <= end) {
18                end = Math.max(end, intervals[i][1]);
19            } 
20            else {
21                // No overlap, store previous interval
22                list.add(new int[]{start, end});
23
24                start = intervals[i][0];
25                end = intervals[i][1];
26            }
27        }
28
29        // Add last interval
30        list.add(new int[]{start, end});
31
32        return list.toArray(new int[list.size()][]);
33    }
34}