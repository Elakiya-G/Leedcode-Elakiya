// Last updated: 8/11/2026, 3:59:08 PM
import java.util.HashSet;

class Solution {
    public int missingInteger(int[] nums) {

        int sum = nums[0];

        // Find the sequential prefix and its sum
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }
}