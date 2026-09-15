// Last updated: 9/15/2026, 4:00:47 PM
1class MinStack {
2
3    Stack<Integer> stack;
4    Stack<Integer> minStack;
5
6    public MinStack() {
7        stack = new Stack<>();
8        minStack = new Stack<>();
9    }
10
11    public void push(int val) {
12
13        stack.push(val);
14
15        if (minStack.isEmpty() || val <= minStack.peek()) {
16            minStack.push(val);
17        }
18    }
19
20    public void pop() {
21
22        int value = stack.pop();
23
24        if (value == minStack.peek()) {
25            minStack.pop();
26        }
27    }
28
29    public int top() {
30        return stack.peek();
31    }
32
33    public int getMin() {
34        return minStack.peek();
35    }
36}
37
38/**
39 * Your MinStack object will be instantiated and called as such:
40 * MinStack obj = new MinStack();
41 * obj.push(value);
42 * obj.pop();
43 * int param_3 = obj.top();
44 * int param_4 = obj.getMin();
45 */