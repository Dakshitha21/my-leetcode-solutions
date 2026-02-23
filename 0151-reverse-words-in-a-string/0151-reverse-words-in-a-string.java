class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String[] res = new String[words.length];
        for(int i = 0; i < words.length; i++){
            res[words.length - 1 - i] = words[i];
        }
        String str = String.join(" ", res);
        return str;
    }
}