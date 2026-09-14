// Last updated: 9/14/2026, 5:16:55 PM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13
14        ListNode dummy = new ListNode(0);
15        ListNode current = dummy;
16
17        int carry = 0;
18
19        while (l1 != null || l2 != null || carry != 0) {
20
21            int sum = carry;
22
23            if (l1 != null) {
24                sum = sum + l1.val;
25                l1 = l1.next;
26            }
27
28            if (l2 != null) {
29                sum = sum + l2.val;
30                l2 = l2.next;
31            }
32
33            carry = sum / 10;
34
35            int digit = sum % 10;
36
37            current.next = new ListNode(digit);
38            current = current.next;
39        }
40
41        return dummy.next;
42    }
43}