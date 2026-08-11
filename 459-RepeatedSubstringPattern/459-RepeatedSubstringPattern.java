// Last updated: 8/11/2026, 4:02:14 PM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str = s+s;
        str = str.substring(1,str.length()-1);
        return str.contains(s);
    }
}