// Last updated: 8/11/2026, 4:00:02 PM
import java.util.HashSet;

class Solution {
    public boolean checkIfExist(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}