// Last updated: 8/11/2026, 4:00:42 PM
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing =true;
        for(int i =1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                decreasing = false;
            }
            if(nums[i]<nums[i-1]){
                increasing = false;
            }
        }
        return increasing || decreasing;
    }
}