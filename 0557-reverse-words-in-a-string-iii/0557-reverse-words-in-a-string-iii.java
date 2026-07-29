class Solution {
    public String reverseWords(String s) {
        String words[]= s.split(" ");
        String ans="";
    for(String word:words){
        for(int i=word.length()-1;i>=0;i--){
            ans+=word.charAt(i);
        }
        ans+=" ";
    }
    return ans.toString().trim();
    }
}