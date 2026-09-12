// Last updated: 9/12/2026, 2:27:11 PM
1import java.util.*;
2
3class Solution {
4    public List<List<String>> groupAnagrams(String[] strs) {
5
6        HashMap<String, List<String>> map = new HashMap<>();
7
8        for (String str : strs) {
9
10            char[] arr = str.toCharArray();
11            Arrays.sort(arr);
12
13            String key = new String(arr);
14
15            if (!map.containsKey(key)) {
16                map.put(key, new ArrayList<>());
17            }
18
19            map.get(key).add(str);
20        }
21
22        return new ArrayList<>(map.values());
23    }
24}