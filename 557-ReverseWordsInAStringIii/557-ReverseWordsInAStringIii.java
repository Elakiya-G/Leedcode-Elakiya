// Last updated: 8/11/2026, 4:02:03 PM
class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            String rev = "";

            for (int j = words[i].length() - 1; j >= 0; j--) {
                rev = rev + words[i].charAt(j);
            }

            result = result + rev;

            if (i != words.length - 1) {
                result = result + " ";
            }
        }

        return result;
    }
}