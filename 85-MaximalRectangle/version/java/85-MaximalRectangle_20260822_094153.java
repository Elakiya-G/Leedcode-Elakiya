// Last updated: 8/22/2026, 9:41:53 AM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        if (matrix.length == 0) {
4            return 0;
5        }
6
7        int cols = matrix[0].length;
8        int[] heights = new int[cols];
9
10        int maxArea = 0;
11
12        for (int i = 0; i < matrix.length; i++) {
13
14            // Build histogram
15            for (int j = 0; j < cols; j++) {
16                if (matrix[i][j] == '1') {
17                    heights[j]++;
18                } else {
19                    heights[j] = 0;
20                }
21            }
22
23            // Find largest rectangle in histogram
24            maxArea = Math.max(maxArea, largestRectangle(heights));
25        }
26
27        return maxArea;
28    }
29
30    private int largestRectangle(int[] heights) {
31        Stack<Integer> stack = new Stack<>();
32        int maxArea = 0;
33
34        for (int i = 0; i <= heights.length; i++) {
35
36            int currentHeight = (i == heights.length)
37                    ? 0
38                    : heights[i];
39
40            while (!stack.isEmpty()
41                    && currentHeight < heights[stack.peek()]) {
42
43                int height = heights[stack.pop()];
44
45                int width;
46
47                if (stack.isEmpty()) {
48                    width = i;
49                } else {
50                    width = i - stack.peek() - 1;
51                }
52
53                maxArea = Math.max(maxArea, height * width);
54            }
55
56            stack.push(i);
57        }
58
59        return maxArea;
60    }
61}