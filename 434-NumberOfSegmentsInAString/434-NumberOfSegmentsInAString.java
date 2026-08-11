// Last updated: 8/11/2026, 4:02:22 PM
class Solution {
    public int countSegments(String s) {
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '&&(i==0||s.charAt(i-1)==' ')){
                count++;
            }
        }
        return count;
    }
}