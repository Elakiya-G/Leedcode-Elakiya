// Last updated: 9/16/2026, 9:38:11 AM
1import java.util.HashMap;
2
3class Solution {
4    public int[] twoSum(int[] nums, int target) {
5        for(int i=0;i<nums.length;i++){
6            for(int j=i+1;j<nums.length;j++){
7                if(nums[i]+nums[j]==target){
8                    return new int[] {i,j};
9            }
10        }
11        }
12        return new int[] {};
13    }
14}