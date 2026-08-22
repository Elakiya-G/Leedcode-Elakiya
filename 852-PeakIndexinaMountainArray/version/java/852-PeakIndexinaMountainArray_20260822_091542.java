// Last updated: 8/22/2026, 9:15:42 AM
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int left = 0;
4        int right = arr.length - 1;
5
6        while (left < right) {
7            int mid = left + (right - left) / 2;
8
9            if (arr[mid] < arr[mid + 1]) {
10                left = mid + 1;
11            } else {
12                right = mid;
13            }
14        }
15
16        return left;
17    }
18}