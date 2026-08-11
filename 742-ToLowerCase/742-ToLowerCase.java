// Last updated: 8/11/2026, 4:01:12 PM
class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char)(ch + ('a' - 'A')));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}