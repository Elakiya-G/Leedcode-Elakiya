// Last updated: 8/22/2026, 9:23:08 AM
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> stack = new Stack<>();
4
5        int result = 0;
6        int number = 0;
7        int sign = 1;
8
9        for (int i = 0; i < s.length(); i++) {
10            char ch = s.charAt(i);
11
12            if (Character.isDigit(ch)) {
13                number = number * 10 + (ch - '0');
14            }
15
16            else if (ch == '+') {
17                result += sign * number;
18                number = 0;
19                sign = 1;
20            }
21
22            else if (ch == '-') {
23                result += sign * number;
24                number = 0;
25                sign = -1;
26            }
27
28            else if (ch == '(') {
29                stack.push(result);
30                stack.push(sign);
31
32                result = 0;
33                sign = 1;
34            }
35
36            else if (ch == ')') {
37                result += sign * number;
38                number = 0;
39
40                result *= stack.pop();
41                result += stack.pop();
42            }
43        }
44
45        result += sign * number;
46
47        return result;
48    }
49}