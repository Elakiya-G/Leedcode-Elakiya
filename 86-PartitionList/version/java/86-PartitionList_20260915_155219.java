// Last updated: 9/15/2026, 3:52:19 PM
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
12    public ListNode partition(ListNode head, int x) {
13
14        ListNode small = new ListNode(0);
15        ListNode large = new ListNode(0);
16
17        ListNode smallHead = small;
18        ListNode largeHead = large;
19
20        while (head != null) {
21
22            if (head.val < x) {
23                small.next = head;
24                small = small.next;
25            } else {
26                large.next = head;
27                large = large.next;
28            }
29
30            head = head.next;
31        }
32
33        // End the large list
34        large.next = null;
35
36        // Connect small list with large list
37        small.next = largeHead.next;
38
39        return smallHead.next;
40    }
41}