// Last updated: 8/22/2026, 10:11:05 AM
1class KthLargest {
2
3    PriorityQueue<Integer> minHeap;
4    int k;
5
6    public KthLargest(int k, int[] nums) {
7        this.k = k;
8        minHeap = new PriorityQueue<>();
9
10        for (int num : nums) {
11            add(num);
12        }
13    }
14
15    public int add(int val) {
16        minHeap.offer(val);
17
18        if (minHeap.size() > k) {
19            minHeap.poll();
20        }
21
22        return minHeap.peek();
23    }
24}