// Last updated: 9/11/2026, 9:10:42 AM
1import java.util.HashSet;
2
3class Solution {
4    public int maximumSetSize(int[] nums1, int[] nums2) {
5
6        HashSet<Integer> set1 = new HashSet<>();
7        HashSet<Integer> set2 = new HashSet<>();
8
9        // Store unique elements
10        for (int x : nums1) {
11            set1.add(x);
12        }
13
14        for (int x : nums2) {
15            set2.add(x);
16        }
17
18        int n = nums1.length;
19
20        // Elements present only in set1
21        int only1 = 0;
22        for (int x : set1) {
23            if (!set2.contains(x)) {
24                only1++;
25            }
26        }
27
28        // Elements present only in set2
29        int only2 = 0;
30        for (int x : set2) {
31            if (!set1.contains(x)) {
32                only2++;
33            }
34        }
35
36        // Common elements
37        int common = 0;
38        for (int x : set1) {
39            if (set2.contains(x)) {
40                common++;
41            }
42        }
43
44        // We can take at most n/2 from each array
45        int take1 = Math.min(only1, n / 2);
46        int take2 = Math.min(only2, n / 2);
47
48        // Remaining spaces can be filled using common elements
49        int remaining = n - take1 - take2;
50
51        int takeCommon = Math.min(common, remaining);
52
53        return take1 + take2 + takeCommon;
54    }
55}