// Last updated: 8/22/2026, 10:12:40 AM
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3
4        PriorityQueue<Integer> maxHeap =
5            new PriorityQueue<>(Collections.reverseOrder());
6
7        for (int stone : stones) {
8            maxHeap.offer(stone);
9        }
10
11        while (maxHeap.size() > 1) {
12            int first = maxHeap.poll();
13            int second = maxHeap.poll();
14
15            if (first != second) {
16                maxHeap.offer(first - second);
17            }
18        }
19
20        if (maxHeap.isEmpty()) {
21            return 0;
22        }
23
24        return maxHeap.peek();
25    }
26}