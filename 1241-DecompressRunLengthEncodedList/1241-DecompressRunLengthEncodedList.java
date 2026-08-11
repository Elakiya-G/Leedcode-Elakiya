// Last updated: 8/11/2026, 4:00:19 PM
class Solution {
    public int[] decompressRLElist(int[] nums) {

        // Find the size of the decompressed array
        int size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        // Create the result array
        int[] result = new int[size];

        int index = 0;

        // Fill the result array
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            for (int j = 0; j < freq; j++) {
                result[index++] = val;
            }
        }

        return result;
    }
}