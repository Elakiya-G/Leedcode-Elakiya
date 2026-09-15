// Last updated: 9/15/2026, 3:53:20 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3
4        int n = nums1.length;
5        int m = nums2.length;
6
7        int[] arr = new int[n + m];
8
9        int i = 0, j = 0, k = 0;
10
11        // Merge both sorted arrays
12        while (i < n && j < m) {
13            if (nums1[i] < nums2[j]) {
14                arr[k] = nums1[i];
15                i++;
16            } else {
17                arr[k] = nums2[j];
18                j++;
19            }
20            k++;
21        }
22
23        // Remaining elements of nums1
24        while (i < n) {
25            arr[k] = nums1[i];
26            i++;
27            k++;
28        }
29
30        // Remaining elements of nums2
31        while (j < m) {
32            arr[k] = nums2[j];
33            j++;
34            k++;
35        }
36
37        int total = n + m;
38
39        // Odd number of elements
40        if (total % 2 == 1) {
41            return arr[total / 2];
42        }
43
44        // Even number of elements
45        return (arr[total / 2 - 1] + arr[total / 2]) / 2.0;
46    }
47}