// Last updated: 9/11/2026, 9:28:56 AM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5
6        // Product of elements before i
7        int product = 1;
8        for (int i = 0; i < n; i++) {
9            ans[i] = product;
10            product = product * nums[i];
11        }
12
13        // Product of elements after i
14        product = 1;
15        for (int i = n - 1; i >= 0; i--) {
16            ans[i] = ans[i] * product;
17            product = product * nums[i];
18        }
19
20        return ans;
21    }
22}