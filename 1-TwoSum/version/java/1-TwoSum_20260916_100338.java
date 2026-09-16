// Last updated: 9/16/2026, 10:03:38 AM
1import java.util.HashMap;
2
3class Solution {
4    public int[] twoSum(int[] nums, int target) {
5        HashMap<Integer,Integer> map=new HashMap<>();
6        for(int i=0;i<nums.length;i++){
7                int needed = target-nums[i];
8                if(map.containsKey(needed)){
9                    return new int[] {map.get(needed),i};
10                }
11                map.put(nums[i],i);
12            }
13        return new int[] {};
14    }
15}