// Last updated: 8/11/2026, 4:02:35 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        //return t.contains(s);
        int i=0,j=0;
        while(i<s.length() && j< t.length()){
            if(s.charAt(i)==t.charAt(j)){
              i++;
          }
            j++;
        }
        return i==s.length();
    }
}