// Last updated: 8/22/2026, 9:39:12 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<String> binaryTreePaths(TreeNode root) {
18        List<String> result = new ArrayList<>();
19
20        dfs(root, "", result);
21
22        return result;
23    }
24
25    private void dfs(TreeNode root, String path, List<String> result) {
26        if (root == null) {
27            return;
28        }
29
30        if (path.isEmpty()) {
31            path = String.valueOf(root.val);
32        } else {
33            path = path + "->" + root.val;
34        }
35
36        if (root.left == null && root.right == null) {
37            result.add(path);
38            return;
39        }
40
41        dfs(root.left, path, result);
42        dfs(root.right, path, result);
43    }
44}