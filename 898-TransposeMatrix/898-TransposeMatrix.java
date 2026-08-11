// Last updated: 8/11/2026, 4:00:54 PM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m= matrix.length;
        int n= matrix[0].length;
        int[][] ans = new int[n][m];
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}