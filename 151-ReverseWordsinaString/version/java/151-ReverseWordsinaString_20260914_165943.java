// Last updated: 9/14/2026, 4:59:43 PM
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.trim().split("\\s+");
4
5        String result = "";
6
7        for (int i = words.length - 1; i >= 0; i--) {
8            result = result + words[i];
9
10            if (i != 0) {
11                result = result + " ";
12            }
13        }
14
15        return result;
16    }
17}