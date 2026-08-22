// Last updated: 8/22/2026, 9:33:36 AM
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
17    public boolean isSymmetric(TreeNode root) {
18        return mirror(root.left, root.right);
19    }
20
21    private boolean mirror(TreeNode left, TreeNode right) {
22        if (left == null && right == null) {
23            return true;
24        }
25
26        if (left == null || right == null) {
27            return false;
28        }
29
30        if (left.val != right.val) {
31            return false;
32        }
33
34        return mirror(left.left, right.right)
35            && mirror(left.right, right.left);
36    }
37}