// Last updated: 9/15/2026, 3:51:03 PM
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
12    public ListNode deleteDuplicates(ListNode head) {
13
14        ListNode dummy = new ListNode(0);
15        dummy.next = head;
16
17        ListNode prev = dummy;
18        ListNode curr = head;
19
20        while (curr != null) {
21
22            // Check whether current value is duplicated
23            if (curr.next != null && curr.val == curr.next.val) {
24
25                int value = curr.val;
26
27                // Skip all nodes having the same value
28                while (curr != null && curr.val == value) {
29                    curr = curr.next;
30                }
31
32                prev.next = curr;
33
34            } else {
35                prev = curr;
36                curr = curr.next;
37            }
38        }
39
40        return dummy.next;
41    }
42}