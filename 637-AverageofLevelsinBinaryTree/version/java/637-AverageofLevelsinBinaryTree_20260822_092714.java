// Last updated: 8/22/2026, 9:27:14 AM
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
17    public List<Double> averageOfLevels(TreeNode root) {
18        List<Double> result = new ArrayList<>();
19
20        Queue<TreeNode> queue = new LinkedList<>();
21        queue.add(root);
22
23        while (!queue.isEmpty()) {
24            int size = queue.size();
25            double sum = 0;
26
27            for (int i = 0; i < size; i++) {
28                TreeNode current = queue.poll();
29
30                sum += current.val;
31
32                if (current.left != null) {
33                    queue.add(current.left);
34                }
35
36                if (current.right != null) {
37                    queue.add(current.right);
38                }
39            }
40
41            result.add(sum / size);
42        }
43
44        return result;
45    }
46}