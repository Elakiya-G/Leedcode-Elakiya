// Last updated: 8/11/2026, 4:03:16 PM
class Solution {
    public int addDigits(int num) {

        while (num >= 10) {

            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }

            num = sum;
        }

        return num;
    }
}