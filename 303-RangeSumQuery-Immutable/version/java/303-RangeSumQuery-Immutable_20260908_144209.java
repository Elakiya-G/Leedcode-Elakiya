// Last updated: 9/8/2026, 2:42:09 PM
1class NumArray {
2
3    int[] prefix;
4
5    public NumArray(int[] nums) {
6        prefix = new int[nums.length + 1];
7
8        for (int i = 0; i < nums.length; i++) {
9            prefix[i + 1] = prefix[i] + nums[i];
10        }
11    }
12
13    public int sumRange(int left, int right) {
14        return prefix[right + 1] - prefix[left];
15    }
16}