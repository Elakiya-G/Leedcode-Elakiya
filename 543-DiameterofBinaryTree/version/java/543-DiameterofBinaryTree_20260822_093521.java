// Last updated: 8/22/2026, 9:35:21 AM
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
17    int diameter = 0;
18
19    public int diameterOfBinaryTree(TreeNode root) {
20        height(root);
21        return diameter;
22    }
23
24    private int height(TreeNode root) {
25        if (root == null) {
26            return 0;
27        }
28
29        int left = height(root.left);
30        int right = height(root.right);
31
32        diameter = Math.max(diameter, left + right);
33
34        return 1 + Math.max(left, right);
35    }
36}