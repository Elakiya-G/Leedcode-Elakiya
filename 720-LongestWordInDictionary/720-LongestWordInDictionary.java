// Last updated: 8/11/2026, 4:01:18 PM
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        HashSet<String>set = new HashSet<>();
        String ans="";
        for(String word : words){
            if(word.length() == 1|| set.contains(word.substring(0,word.length()-1))){
                set.add(word);
                if(word.length()>ans.length()){
                    ans = word;
                }
            }
        }
        return ans;
    }
}