// Last updated: 9/11/2026, 9:13:09 AM
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3
4        int n = arr.length;
5
6        if (n == 1) {
7            return 1;
8        }
9
10        int left = 0;
11        int right = 1;
12        int answer = 1;
13
14        while (right < n) {
15
16            // Two equal elements
17            if (arr[right] == arr[right - 1]) {
18                left = right;
19            }
20
21            // Only two elements
22            else if (right - left == 1) {
23                answer = Math.max(answer, 2);
24            }
25
26            // Direction is alternating
27            else if ((arr[right] > arr[right - 1] && arr[right - 1] < arr[right - 2]) ||
28                     (arr[right] < arr[right - 1] && arr[right - 1] > arr[right - 2])) {
29
30                answer = Math.max(answer, right - left + 1);
31            }
32
33            // Direction did not alternate
34            else {
35                left = right - 1;
36            }
37
38            right++;
39        }
40
41        return answer;
42    }
43}