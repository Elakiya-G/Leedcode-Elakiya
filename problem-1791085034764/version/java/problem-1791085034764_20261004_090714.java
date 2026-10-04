// Last updated: 10/4/2026, 9:07:14 AM
1class Solution {
2    public int minRotations(String s) {
3        int rotations = 0;
4        int current =0;
5        for(int i=0;i<s.length();i++){
6            int target = s.charAt(i)-'0';
7            int clockwise = Math.abs(target-current);
8            int counterClockwise = 10-clockwise;
9            rotations +=Math.min(clockwise,counterClockwise);
10            current=target;
11        }
12        return rotations;
13    }
14}