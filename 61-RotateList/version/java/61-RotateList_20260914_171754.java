// Last updated: 9/14/2026, 5:17:54 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode rotateRight(ListNode head, int k) {
13
14        if (head == null || head.next == null || k == 0) {
15            return head;
16        }
17
18        // Find length
19        int length = 1;
20        ListNode current = head;
21
22        while (current.next != null) {
23            current = current.next;
24            length++;
25        }
26
27        // Avoid unnecessary rotations
28        k = k % length;
29
30        if (k == 0) {
31            return head;
32        }
33
34        // Make the list circular
35        current.next = head;
36
37        // Find the new last node
38        int steps = length - k;
39        current = head;
40
41        for (int i = 1; i < steps; i++) {
42            current = current.next;
43        }
44
45        // New head
46        head = current.next;
47
48        // Break the circle
49        current.next = null;
50
51        return head;
52    }
53}