// Last updated: 8/11/2026, 3:58:49 PM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Find the maximum value in each column
        int[] maxCol = new int[n];

        for (int j = 0; j < n; j++) {
            int max = -1;
            for (int i = 0; i < m; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            maxCol[j] = max;
        }

        // Replace -1 with the column maximum
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = maxCol[j];
                }
            }
        }

        return matrix;
    }
}