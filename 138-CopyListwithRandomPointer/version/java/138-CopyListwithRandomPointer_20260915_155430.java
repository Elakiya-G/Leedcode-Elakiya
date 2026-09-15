// Last updated: 9/15/2026, 3:54:30 PM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18
19        if (head == null) {
20            return null;
21        }
22
23        // Step 1: Create a copy of every node
24        Node curr = head;
25
26        while (curr != null) {
27            Node newNode = new Node(curr.val);
28
29            newNode.next = curr.next;
30            curr.next = newNode;
31
32            curr = newNode.next;
33        }
34
35        // Step 2: Set random pointers
36        curr = head;
37
38        while (curr != null) {
39
40            if (curr.random != null) {
41                curr.next.random = curr.random.next;
42            }
43
44            curr = curr.next.next;
45        }
46
47        // Step 3: Separate original and copied lists
48        Node dummy = new Node(0);
49        Node copy = dummy;
50
51        curr = head;
52
53        while (curr != null) {
54
55            copy.next = curr.next;
56            copy = copy.next;
57
58            curr.next = curr.next.next;
59            curr = curr.next;
60        }
61
62        return dummy.next;
63    }
64}