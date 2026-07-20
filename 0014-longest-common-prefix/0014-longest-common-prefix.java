class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0 || strs[0] == null)
            return "";

        if(strs.length==1)
            return strs[0];
        
        String s = strs[0];
        int idx = 0;
        int count = 0;

        while(idx < s.length()){

            boolean res = true;
        for( int i = 1 ; i < strs.length ; i++){

            if(idx >= strs[i].length() || 
               s.charAt(idx) != strs[i].charAt(idx)){
                res = false;
                break;
               }

        }
            if(res){
                count ++;
                idx ++;
            }
            else break ;
    }

        if(count >= 1)
            return s.substring(0 , count);
        return "";
    }
}