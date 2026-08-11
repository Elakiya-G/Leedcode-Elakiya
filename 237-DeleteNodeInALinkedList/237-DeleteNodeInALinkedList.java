// Last updated: 8/11/2026, 4:03:25 PM
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}