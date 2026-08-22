// Last updated: 8/22/2026, 10:15:38 AM
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int perimeter = 0;
4
5        for (int i = 0; i < grid.length; i++) {
6            for (int j = 0; j < grid[0].length; j++) {
7
8                if (grid[i][j] == 1) {
9                    perimeter += 4;
10
11                    if (i > 0 && grid[i - 1][j] == 1) {
12                        perimeter -= 2;
13                    }
14
15                    if (j > 0 && grid[i][j - 1] == 1) {
16                        perimeter -= 2;
17                    }
18                }
19            }
20        }
21
22        return perimeter;
23    }
24}