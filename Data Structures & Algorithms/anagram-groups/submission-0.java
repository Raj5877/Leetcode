class Solution {
    public boolean isAnagram(String s1, String s2){
        int count[] = new int[26];
        for(char c:s1.toCharArray()){count[c-'a']++;}
        for(char c:s2.toCharArray()){count[c-'a']--;}
        for(int i:count){
            if(i!=0)    return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean group_found;
        for(int i=0;i<strs.length;i++){
            if(result.isEmpty()){
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                result.add(temp); 
                continue;
            }
            group_found=false;
            for(List<String> temp:result){
                if(isAnagram(temp.get(0),strs[i])){
                    temp.add(strs[i]);
                    group_found=true;
                }
            }
            if(!group_found){
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                result.add(temp); 
            }
        }
        return result;
    }
}
