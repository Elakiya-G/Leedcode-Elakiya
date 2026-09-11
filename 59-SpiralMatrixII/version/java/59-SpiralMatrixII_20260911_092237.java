// Last updated: 9/11/2026, 9:22:37 AM
1class Solution {
2    public int[][] generateMatrix(int n) {
3
4        int[][] matrix = new int[n][n];
5
6        int top = 0;
7        int bottom = n - 1;
8        int left = 0;
9        int right = n - 1;
10
11        int num = 1;
12
13        while (top <= bottom && left <= right) {
14
15            // Left to Right
16            for (int i = left; i <= right; i++) {
17                matrix[top][i] = num;
18                num++;
19            }
20            top++;
21
22            // Top to Bottom
23            for (int i = top; i <= bottom; i++) {
24                matrix[i][right] = num;
25                num++;
26            }
27            right--;
28
29            // Right to Left
30            if (top <= bottom) {
31                for (int i = right; i >= left; i--) {
32                    matrix[bottom][i] = num;
33                    num++;
34                }
35                bottom--;
36            }
37
38            // Bottom to Top
39            if (left <= right) {
40                for (int i = bottom; i >= top; i--) {
41                    matrix[i][left] = num;
42                    num++;
43                }
44                left++;
45            }
46        }
47
48        return matrix;
49    }
50}