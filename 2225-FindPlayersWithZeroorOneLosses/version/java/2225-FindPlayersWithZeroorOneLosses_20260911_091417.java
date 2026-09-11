// Last updated: 9/11/2026, 9:14:17 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> findWinners(int[][] matches) {
5
6        HashMap<Integer, Integer> losses = new HashMap<>();
7
8        // Count losses of each player
9        for (int i = 0; i < matches.length; i++) {
10
11            int winner = matches[i][0];
12            int loser = matches[i][1];
13
14            // Add winner with 0 losses if not present
15            if (!losses.containsKey(winner)) {
16                losses.put(winner, 0);
17            }
18
19            // Increase loser's loss count
20            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
21        }
22
23        List<Integer> zeroLoss = new ArrayList<>();
24        List<Integer> oneLoss = new ArrayList<>();
25
26        // Separate players based on losses
27        for (int player : losses.keySet()) {
28
29            if (losses.get(player) == 0) {
30                zeroLoss.add(player);
31            }
32            else if (losses.get(player) == 1) {
33                oneLoss.add(player);
34            }
35        }
36
37        // Sort both lists
38        Collections.sort(zeroLoss);
39        Collections.sort(oneLoss);
40
41        List<List<Integer>> answer = new ArrayList<>();
42
43        answer.add(zeroLoss);
44        answer.add(oneLoss);
45
46        return answer;
47    }
48}