// Last updated: 9/12/2026, 2:26:11 PM
1import java.util.*;
2
3class Solution {
4    public int lengthOfLongestSubstring(String s) {
5        HashSet<Character> set = new HashSet<>();
6
7        int left = 0;
8        int max = 0;
9
10        for (int right = 0; right < s.length(); right++) {
11
12            while (set.contains(s.charAt(right))) {
13                set.remove(s.charAt(left));
14                left++;
15            }
16
17            set.add(s.charAt(right));
18
19            max = Math.max(max, right - left + 1);
20        }
21
22        return max;
23    }
24}