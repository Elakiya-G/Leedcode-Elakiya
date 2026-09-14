// Last updated: 9/14/2026, 5:11:55 PM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3
4        // Check rows
5        for (int i = 0; i < 9; i++) {
6            boolean[] seen = new boolean[9];
7
8            for (int j = 0; j < 9; j++) {
9                if (board[i][j] != '.') {
10                    int num = board[i][j] - '1';
11
12                    if (seen[num]) {
13                        return false;
14                    }
15
16                    seen[num] = true;
17                }
18            }
19        }
20
21        // Check columns
22        for (int j = 0; j < 9; j++) {
23            boolean[] seen = new boolean[9];
24
25            for (int i = 0; i < 9; i++) {
26                if (board[i][j] != '.') {
27                    int num = board[i][j] - '1';
28
29                    if (seen[num]) {
30                        return false;
31                    }
32
33                    seen[num] = true;
34                }
35            }
36        }
37
38        // Check 3 x 3 boxes
39        for (int row = 0; row < 9; row += 3) {
40            for (int col = 0; col < 9; col += 3) {
41
42                boolean[] seen = new boolean[9];
43
44                for (int i = row; i < row + 3; i++) {
45                    for (int j = col; j < col + 3; j++) {
46
47                        if (board[i][j] != '.') {
48                            int num = board[i][j] - '1';
49
50                            if (seen[num]) {
51                                return false;
52                            }
53
54                            seen[num] = true;
55                        }
56                    }
57                }
58            }
59        }
60
61        return true;
62    }
63}