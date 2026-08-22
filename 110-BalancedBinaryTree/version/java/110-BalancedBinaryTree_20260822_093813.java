// Last updated: 8/22/2026, 9:38:13 AM
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
17    public boolean isBalanced(TreeNode root) {
18        return height(root) != -1;
19    }
20
21    private int height(TreeNode root) {
22        if (root == null) {
23            return 0;
24        }
25
26        int left = height(root.left);
27        if (left == -1) {
28            return -1;
29        }
30
31        int right = height(root.right);
32        if (right == -1) {
33            return -1;
34        }
35
36        if (Math.abs(left - right) > 1) {
37            return -1;
38        }
39
40        return 1 + Math.max(left, right);
41    }
42}