// Last updated: 8/22/2026, 9:34:31 AM
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
17    public int minDepth(TreeNode root) {
18        if (root == null) {
19            return 0;
20        }
21
22        if (root.left == null) {
23            return 1 + minDepth(root.right);
24        }
25
26        if (root.right == null) {
27            return 1 + minDepth(root.left);
28        }
29
30        return 1 + Math.min(
31            minDepth(root.left),
32            minDepth(root.right)
33        );
34    }
35}