class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i=0;
        boolean finished=true;
        StringBuilder result = new StringBuilder();
        for(char c:strs[0].toCharArray()){
            for(int j=1; j<strs.length;j++){
                if(strs[j].length()==i || strs[j].charAt(i)!=c){
                    finished=false;
                    break;
                }
                
            }
            if(finished==false){
                return result.toString();
            }
            result.append(c);
            i++;
        }
        return result.toString();
    }
}