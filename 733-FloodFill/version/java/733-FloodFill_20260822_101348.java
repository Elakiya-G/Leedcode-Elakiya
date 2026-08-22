// Last updated: 8/22/2026, 10:13:48 AM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3
4        int originalColor = image[sr][sc];
5
6        if (originalColor == color) {
7            return image;
8        }
9
10        dfs(image, sr, sc, originalColor, color);
11
12        return image;
13    }
14
15    private void dfs(int[][] image, int r, int c,
16                     int originalColor, int color) {
17
18        if (r < 0 || r >= image.length ||
19            c < 0 || c >= image[0].length) {
20            return;
21        }
22
23        if (image[r][c] != originalColor) {
24            return;
25        }
26
27        image[r][c] = color;
28
29        dfs(image, r + 1, c, originalColor, color);
30        dfs(image, r - 1, c, originalColor, color);
31        dfs(image, r, c + 1, originalColor, color);
32        dfs(image, r, c - 1, originalColor, color);
33    }
34}