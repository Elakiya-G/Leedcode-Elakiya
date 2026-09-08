// Last updated: 9/8/2026, 2:37:43 PM
1import java.util.*;
2
3class Solution {
4    public String countOfAtoms(String formula) {
5        Stack<Map<String, Integer>> stack = new Stack<>();
6        stack.push(new HashMap<>());
7
8        int i = 0;
9
10        while (i < formula.length()) {
11            char ch = formula.charAt(i);
12
13            if (ch == '(') {
14                stack.push(new HashMap<>());
15                i++;
16            } 
17            else if (ch == ')') {
18                Map<String, Integer> current = stack.pop();
19                i++;
20
21                int num = 0;
22                while (i < formula.length() && Character.isDigit(formula.charAt(i))) {
23                    num = num * 10 + (formula.charAt(i) - '0');
24                    i++;
25                }
26
27                if (num == 0) {
28                    num = 1;
29                }
30
31                for (String atom : current.keySet()) {
32                    current.put(atom, current.get(atom) * num);
33                }
34
35                Map<String, Integer> top = stack.peek();
36
37                for (String atom : current.keySet()) {
38                    top.put(atom, top.getOrDefault(atom, 0) + current.get(atom));
39                }
40            } 
41            else {
42                // Read atom name
43                StringBuilder atom = new StringBuilder();
44                atom.append(ch);
45                i++;
46
47                while (i < formula.length() && Character.isLowerCase(formula.charAt(i))) {
48                    atom.append(formula.charAt(i));
49                    i++;
50                }
51
52                // Read number
53                int num = 0;
54                while (i < formula.length() && Character.isDigit(formula.charAt(i))) {
55                    num = num * 10 + (formula.charAt(i) - '0');
56                    i++;
57                }
58
59                if (num == 0) {
60                    num = 1;
61                }
62
63                Map<String, Integer> top = stack.peek();
64                top.put(atom.toString(),
65                        top.getOrDefault(atom.toString(), 0) + num);
66            }
67        }
68
69        Map<String, Integer> result = stack.pop();
70
71        // Sort atoms alphabetically
72        TreeMap<String, Integer> sorted = new TreeMap<>(result);
73
74        StringBuilder answer = new StringBuilder();
75
76        for (String atom : sorted.keySet()) {
77            answer.append(atom);
78
79            if (sorted.get(atom) > 1) {
80                answer.append(sorted.get(atom));
81            }
82        }
83
84        return answer.toString();
85    }
86}