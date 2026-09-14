// Last updated: 9/14/2026, 5:04:56 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int[] count = new int[26];
4
5        // Count frequency of each character
6        for (int i = 0; i < word.length(); i++) {
7            count[word.charAt(i) - 'a']++;
8        }
9
10        // Sort frequencies
11        java.util.Arrays.sort(count);
12
13        int pushes = 0;
14        int press = 1;
15        int characters = 0;
16
17        // Start from highest frequency
18        for (int i = 25; i >= 0; i--) {
19            if (count[i] == 0) {
20                continue;
21            }
22
23            pushes += count[i] * press;
24            characters++;
25
26            // After every 8 characters, increase pushes
27            if (characters == 8) {
28                press++;
29                characters = 0;
30            }
31        }
32
33        return pushes;
34    }
35}