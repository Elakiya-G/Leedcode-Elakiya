// Last updated: 9/15/2026, 3:55:33 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14
15        ListNode slow = head;
16        ListNode fast = head;
17
18        // Step 1: Find whether a cycle exists
19        while (fast != null && fast.next != null) {
20
21            slow = slow.next;
22            fast = fast.next.next;
23
24            if (slow == fast) {
25
26                // Step 2: Find the starting node of the cycle
27                slow = head;
28
29                while (slow != fast) {
30                    slow = slow.next;
31                    fast = fast.next;
32                }
33
34                return slow;
35            }
36        }
37
38        // No cycle
39        return null;
40    }
41}