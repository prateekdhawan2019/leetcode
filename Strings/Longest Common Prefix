class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        int minlenString = strs[0].length();
        
        for(int i=1 ; i<strs.length ; ++i){
            minlenString = Math.min(minlenString, strs[i].length());
        }
        for(int i=0 ; i<minlenString ; ++i){
            char ch = strs[0].charAt(i);
            
            for(String str : strs){
                if(str.charAt(i) != ch) return sb.toString();
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
