class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];
        for(int i = 0; i < strs.length; i++){
            if(strs[i].isEmpty() || strs[i] == null)
                return "";
        }
        String ref = strs[0];
        int ch = 0;
        String prefix = "";
        if(strs.length == 1)
            return ref;
        outer:
        while(ch < ref.length()){
            int i = 1;
            while(i < strs.length){
                if(ch < strs[i].length() && ref.charAt(ch) == strs[i].charAt(ch))
                     i++;  
                else
                    break outer;
            }
            prefix = prefix + ref.charAt(ch);
            ch++;
        }
        return prefix;
    }
}