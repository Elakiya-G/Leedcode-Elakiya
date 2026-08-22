// Last updated: 8/22/2026, 9:36:19 AM
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        Stack<Integer> stack = new Stack<>();
4        int maxArea = 0;
5
6        for (int i = 0; i <= heights.length; i++) {
7
8            int currentHeight;
9
10            if (i == heights.length) {
11                currentHeight = 0;
12            } else {
13                currentHeight = heights[i];
14            }
15
16            while (!stack.isEmpty() &&
17                   currentHeight < heights[stack.peek()]) {
18
19                int height = heights[stack.pop()];
20
21                int width;
22
23                if (stack.isEmpty()) {
24                    width = i;
25                } else {
26                    width = i - stack.peek() - 1;
27                }
28
29                int area = height * width;
30
31                maxArea = Math.max(maxArea, area);
32            }
33
34            stack.push(i);
35        }
36
37        return maxArea;
38    }
39}