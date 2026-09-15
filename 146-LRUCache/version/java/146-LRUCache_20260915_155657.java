// Last updated: 9/15/2026, 3:56:57 PM
1class LRUCache {
2
3    class Node {
4        int key;
5        int value;
6        Node prev;
7        Node next;
8
9        Node(int key, int value) {
10            this.key = key;
11            this.value = value;
12        }
13    }
14
15    int capacity;
16    HashMap<Integer, Node> map;
17    Node head;
18    Node tail;
19
20    public LRUCache(int capacity) {
21        this.capacity = capacity;
22        map = new HashMap<>();
23
24        head = new Node(0, 0);
25        tail = new Node(0, 0);
26
27        head.next = tail;
28        tail.prev = head;
29    }
30
31    public int get(int key) {
32
33        if (!map.containsKey(key)) {
34            return -1;
35        }
36
37        Node node = map.get(key);
38
39        // Move recently used node to front
40        remove(node);
41        addFirst(node);
42
43        return node.value;
44    }
45
46    public void put(int key, int value) {
47
48        // If key already exists
49        if (map.containsKey(key)) {
50            Node node = map.get(key);
51
52            node.value = value;
53
54            remove(node);
55            addFirst(node);
56
57            return;
58        }
59
60        // Create new node
61        Node node = new Node(key, value);
62
63        map.put(key, node);
64        addFirst(node);
65
66        // If capacity exceeded
67        if (map.size() > capacity) {
68
69            Node last = tail.prev;
70
71            remove(last);
72            map.remove(last.key);
73        }
74    }
75
76    // Add node after head
77    public void addFirst(Node node) {
78
79        node.next = head.next;
80        node.prev = head;
81
82        head.next.prev = node;
83        head.next = node;
84    }
85
86    // Remove node
87    public void remove(Node node) {
88
89        node.prev.next = node.next;
90        node.next.prev = node.prev;
91    }
92}
93
94/**
95 * Your LRUCache object will be instantiated and called as such:
96 * LRUCache obj = new LRUCache(capacity);
97 * int param_1 = obj.get(key);
98 * obj.put(key,value);
99 */